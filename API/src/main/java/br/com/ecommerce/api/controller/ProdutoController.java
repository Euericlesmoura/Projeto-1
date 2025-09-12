package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Cliente;
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

    //Cadastrar
    @PostMapping
    public ResponseEntity<Produto> cadastrarProduto (@RequestBody Produto produto) {

        //1. Tentar cadastrar o cliente
        produtoService.cadastrarProduto(produto);

        //Codigo 201 - CREATED
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }

    //Buscar
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarProdutoPorId(@PathVariable Integer id) {

        //1. Procurar e guardar Produto
        Produto produto = produtoService.buscarPorId(id);

        //2. Se não encontrar, retornar erro
        if (produto == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto " + id + " não encontrado !");
        }

        //3. Se encontrar, retornar Produto
        return ResponseEntity.ok(produto);
    }

    //Deletar
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarProdutoPorId(@PathVariable Integer id) {

        //1. Verificar se o cliente existe
        Produto produto = produtoService.deletarProduto(id);

        //2. Se não existir, retornar nulo
        if (produto == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente " + id + " não encontrado !");
        }

        //3. Se existir, excluo
        return ResponseEntity.ok(produto);
    }

    //Metodo Atualizar
    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarProduto(@PathVariable Integer id, @RequestBody Produto produtoNovo) {

        //1. Tento atualizar o Cliente
        Produto prod = produtoService.atualizarProduto(id, produtoNovo);

        //2. Se não achar o Cliente, mostro erro
        if (prod == null) {
            return ResponseEntity.status(404).body("Produto não encontrado !");
        }

        //3. Se achar, retorno ok
        return ResponseEntity.ok(prod);
    }

}
