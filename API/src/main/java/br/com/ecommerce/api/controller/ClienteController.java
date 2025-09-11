package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/clientes")
public class ClienteController {
    //Controller -> Service
    private final ClienteService clienteService;

    public ClienteController (ClienteService service) {
        clienteService = service;
    }

    //Listar Todos
    @GetMapping
    public ResponseEntity<List<Cliente>> listarClientes() {
        //1. Pegar a lista de clientes
        List<Cliente> clientes = clienteService.listarTodos();

        return ResponseEntity.ok(clientes);
    }

    //Cadastrar
    @PostMapping
    public ResponseEntity<Cliente> cadastrarCliente (@RequestBody Cliente cliente) {

        //1. Tentar cadastrar o cliente
        clienteService.cadastrarCliente(cliente);

        //Codigo 200 - OK
        //return ResponseEntity.ok(cliente);

        //Codigo 201 - CREATED
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }


    //Buscar
    //Path Variable recebe um valor no LINK
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarClientePorId(@PathVariable Integer id) {

        //1. Procurar e guardar o Cliente
        Cliente cliente = clienteService.buscarPorId(id);

        //2. Se não encontrar, retornar erro
        if (cliente == null) {
            //Forma de retorno mais simples
            //return ResponseEntity.notFound().build();

            //Forma de retorno personalizada
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente " + id + " não encontrado !");
        }

        //3. Se encontrar, retornar o cliente
        return ResponseEntity.ok(cliente);
    }

    //Deletar
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarClientePorId(@PathVariable Integer id) {

        //1. Verificar se o cliente existe
        Cliente cliente = clienteService.deletarCliente(id);

        //2. Se não existir, retornar nulo
        if (cliente == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente " + id + " não encontrado !");
        }

        //3. Se existir, excluo
        return ResponseEntity.ok(cliente);
    }

    //Metodo Atualizar
    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarCliente (@PathVariable Integer id, @RequestBody Cliente clienteNovo) {

        //1. Tento atualizar o Cliente
        Cliente cl =  clienteService.atualizarCliente(id, clienteNovo);

        //2. Se não achar o Cliente, mostro erro
        if (cl == null) {
            return ResponseEntity.status(404).body("Cliente não encontrado !");
        }

        //3. Se achar, retorno ok
        return ResponseEntity.ok(cl);
    }

}
