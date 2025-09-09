package br.com.ecommerce.api.controller;

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

    public PagamentoController (PagamentoService service) {

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
}
