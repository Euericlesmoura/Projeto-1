package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.EnderecoDeEntrega;
import br.com.ecommerce.api.repository.EnderecoDeEntregaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoDeEntregaService {

    private final EnderecoDeEntregaRepository enderecoDeEntregaRepository;

    public EnderecoDeEntregaService (EnderecoDeEntregaRepository repo) {

        enderecoDeEntregaRepository = repo;
    }

    public List<EnderecoDeEntrega> listarTodos() {
        return enderecoDeEntregaRepository.findAll();
    }

    public EnderecoDeEntrega cadastrarEnderecoDeEntrega (EnderecoDeEntrega end) {
        return enderecoDeEntregaRepository.save(end);
    }
}
