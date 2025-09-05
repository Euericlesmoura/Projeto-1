package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Produto;
import br.com.ecommerce.api.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//Anotaçao
@Service
public class ProdutoService {

    //Injeçao
    private final ProdutoRepository produtoRepository;

    //Construtor
    public ProdutoService (ProdutoRepository repo) {
        produtoRepository = repo;
    }

    //Metodo
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }
}
