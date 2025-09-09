package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.EnderecoDeEntrega;
import br.com.ecommerce.api.service.EnderecoDeEntregaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enderecodeentrega")
public class EnderecoDeEntregaController {

    private final EnderecoDeEntregaService enderecoDeEntregaService;

    public EnderecoDeEntregaController (EnderecoDeEntregaService service) {

        enderecoDeEntregaService = service;
    }

    @GetMapping
    public ResponseEntity<List<EnderecoDeEntrega>> listarEnderecoDeEntrega() {

        List<EnderecoDeEntrega> enderecos = enderecoDeEntregaService.listarTodos();

        return ResponseEntity.ok(enderecos);
    }

    @PostMapping
    public ResponseEntity<EnderecoDeEntrega> cadastrarEnderecoDeEntrega (@RequestBody EnderecoDeEntrega end) {

        enderecoDeEntregaService.cadastrarEnderecoDeEntrega(end);
        return ResponseEntity.status(HttpStatus.CREATED).body(end);
    }
}
