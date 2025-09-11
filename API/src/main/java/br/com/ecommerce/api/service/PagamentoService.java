package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Pagamento;
import br.com.ecommerce.api.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//Anotaçao
@Service
public class PagamentoService {

    //Injeçao
    private final PagamentoRepository pagamentoRepository;

    //Construtor
    public PagamentoService (PagamentoRepository repo) {
        pagamentoRepository = repo;
    }

    //Metodo
    public List<Pagamento> listarTodos() {
        return pagamentoRepository.findAll();
    }

    public Pagamento cadastrarPagamento (Pagamento pag) {
        return pagamentoRepository.save(pag);
    }
}


