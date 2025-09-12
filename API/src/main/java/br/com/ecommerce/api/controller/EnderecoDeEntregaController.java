package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Cliente;
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

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarEnderecoDeEntregaPorId(@PathVariable Integer id) {

        EnderecoDeEntrega endereco = enderecoDeEntregaService.buscarPorId(id);

        if (endereco == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(endereco);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarEnderecoDeEntregaPorId(@PathVariable Integer id) {

        EnderecoDeEntrega endereco = enderecoDeEntregaService.deletarEndereco(id);

        if (endereco == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Endereco " + id + " não encontrado !");
        }

        return ResponseEntity.ok(endereco);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarEnderecoDeEntrega (@PathVariable Integer id, @RequestBody EnderecoDeEntrega enderecoNovo) {

        EnderecoDeEntrega end = enderecoDeEntregaService.atualizarEndereco(id, enderecoNovo);

        if (end == null) {
            return ResponseEntity.status(404).body("Endereco não encontrado !");
        }

        return ResponseEntity.ok(end);
    }
}
