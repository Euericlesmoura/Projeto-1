package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Cliente;
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

    //Metodo
    public Pagamento cadastrarPagamento (Pagamento pag) {
        return pagamentoRepository.save(pag);
    }

    //Metodo
    public Pagamento buscarPorId(Integer id) {
        return pagamentoRepository.findById(id).orElse(null);
    }

    //Metodo
    public Pagamento deletarPagamento (Integer id) {

        //1. Verificar se o cliente existe
        Pagamento pagamento = buscarPorId(id);

        //2. Se não existir, retornar nulo
        if (pagamento == null) {
            return null;
        }

        //3. Se existir, excluo
        pagamentoRepository.delete(pagamento);
        return pagamento;
    }

    //Metodo
    public Pagamento atualizarPagamento (Integer id, Pagamento pagamentoNovo) {

        //1. Procurar quem eu quero atualizar
        Pagamento pagamentoAntigo = buscarPorId(id);

        //2. Se eu não encontrar, retorno nulo
        if (pagamentoAntigo == null) {
            return null;
        }

        //3. Se eu achar, eu atualizo
        pagamentoAntigo.setDataPagamento(pagamentoNovo.getDataPagamento());
        pagamentoAntigo.setFormaPagamento(pagamentoNovo.getFormaPagamento());
        pagamentoAntigo.setStatus(pagamentoNovo.getStatus());
        return pagamentoRepository.save(pagamentoAntigo);
    }
}


