package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.model.Pedido;
import br.com.ecommerce.api.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {

    //Controller <CHAMANDO> Service
    private final PedidoService pedidoService;

    public PedidoController (PedidoService pedido) {

        pedidoService = pedido;
    }

    //Metodo Listar
    @GetMapping
    public ResponseEntity<List<Pedido>> listarPedidos() {

        List<Pedido> pedido = pedidoService.listarTodos();
        return ResponseEntity.ok(pedido);
    }

    //Metodo Cadastrar
    @PostMapping
    public ResponseEntity<Pedido> cadastrarPedido(@RequestBody Pedido pedido) {

        pedidoService.cadastrarPedido(pedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedido);
    }

    //Metodo Buscar
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPedidoPorId(@PathVariable Integer id) {

        //1. Procurar e guardar o Cliente
        Pedido pedido = pedidoService.buscarPedidoPorId(id);

        //2. Se não encontrar, retornar erro
        if (pedido == null) {
            return ResponseEntity.notFound().build();
        }

        //3. Se encontrar, retornar o cliente
        return ResponseEntity.ok(pedido);
    }

    //Metodo Deletar
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarPedidoPorId(@PathVariable Integer id) {

        //1. Verificar se o cliente existe
        Pedido pedido = pedidoService.deletarPedido(id);

        //2. Se não existir, retornar nulo
        if (pedido == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pedido " + id + " não encontrado !");
        }

        //3. Se existir, excluo
        return ResponseEntity.ok(pedido);
    }

    //Metodo Atualizar
    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarPedido(@PathVariable Integer id, @RequestBody Pedido pedidoNovo) {

        //1. Tento atualizar o Cliente
        Pedido pd = pedidoService.atualizarPedido(id, pedidoNovo);

        //2. Se não achar o Cliente, mostro erro
        if (pd == null) {
            return ResponseEntity.status(404).body("Pedido não encontrado !");
        }

        //3. Se achar, retorno ok
        return ResponseEntity.ok(pd);
    }
}