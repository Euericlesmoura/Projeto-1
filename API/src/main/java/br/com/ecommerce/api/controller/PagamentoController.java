package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.model.Pagamento;
import br.com.ecommerce.api.service.PagamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Anotaçao
@RestController
@RequestMapping("/api/pagamento")
public class PagamentoController {

    //Controller
    private final PagamentoService pagamentoService;

    public PagamentoController(PagamentoService service) {

        pagamentoService = service;
    }

    //Litar Todos
    @GetMapping
    public ResponseEntity<List<Pagamento>> listarTodos() {
        //Pegar todos os pagamentos
        List<Pagamento> pagamento = pagamentoService.listarTodos();

        return ResponseEntity.ok(pagamento);
    }

    @PostMapping
    public ResponseEntity<Pagamento> cadastrarPagamento(@RequestBody Pagamento pag) {

        pagamentoService.cadastrarPagamento(pag);
        return ResponseEntity.status(HttpStatus.CREATED).body(pag);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPagamentoPorId(@PathVariable Integer id) {

        //1. Procurar e guardar o Cliente
        Pagamento pagamento = pagamentoService.buscarPorId(id);

        //2. Se não encontrar, retornar erro
        if (pagamento == null) {
            return ResponseEntity.notFound().build();
        }

        //3. Se encontrar, retornar o cliente
        return ResponseEntity.ok(pagamento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarPagamentoPorId(@PathVariable Integer id) {

        //1. Verificar se o cliente existe
        Pagamento pagamento = pagamentoService.deletarPagamento(id);

        //2. Se não existir, retornar nulo
        if (pagamento == null) {
            return ResponseEntity.status(404).body("Pagamento não encontrado !");
        }

        //3. Se existir, excluo
        return ResponseEntity.ok(pagamento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarPagamento(@PathVariable Integer id, @RequestBody Pagamento pagamentoNovo) {

        //1. Tento atualizar o Cliente
        Pagamento pg = pagamentoService.atualizarPagamento(id, pagamentoNovo);

        //2. Se não achar o Cliente, mostro erro
        if (pg == null) {
            return ResponseEntity.status(404).body("Pagamento não encontrado !");
        }

        //3. Se achar, retorno ok
        return ResponseEntity.ok(pg);
    }
}
