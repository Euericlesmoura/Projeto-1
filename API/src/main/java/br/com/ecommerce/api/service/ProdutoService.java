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

    //Metodo Cadastrar
    public Produto cadastrarProduto (Produto prod) {

        return produtoRepository.save(prod);
    }

    //Metodo Buscar
    public Produto buscarPorId (Integer id) {
        return produtoRepository.findById(id).orElse(null);
    }

    //Metodo Deletar
    public Produto deletarProduto (Integer id) {

        //1. Verificar se o cliente existe
        Produto produto = buscarPorId(id);

        //2. Se não existir, retornar nulo
        if (produto == null) {
            return null;
        }

        //3. Se existir, excluo
        produtoRepository.delete(produto);
        return produto;
    }
}
