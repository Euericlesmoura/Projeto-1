package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Produto;
import br.com.ecommerce.api.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    //Buscar
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarProdutoPorId(@PathVariable Integer id) {

        //1. Procurar e guardar Produto
        Produto produto = produtoService.buscarPorId(id);

        //2. Se não encontrar, retornar erro
        if (produto == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente " + id + " não encontrado !");
        }

        //3. Se encontrar, retornar Produto
        return ResponseEntity.ok(produto);
    }

    //Deletar


}
