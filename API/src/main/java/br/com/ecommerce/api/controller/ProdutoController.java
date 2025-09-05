package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Produto;
import br.com.ecommerce.api.repository.ProdutoRepository;
import br.com.ecommerce.api.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Anotaçao
@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
    //Controller -> Service
    private final ProdutoService produtoService;

    public ProdutoController (ProdutoService service) {
        produtoService = service;
    }

    //Listar Todos
    @GetMapping
    public ResponseEntity<List<Produto>> listarProdutos() {
        //1. Pegar todos os produtos
        List<Produto> produto = produtoService.listarTodos();

        return ResponseEntity.ok(produto);
    }
}
