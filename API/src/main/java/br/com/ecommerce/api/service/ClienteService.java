package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    //Injeção de Dependência
    //Falar que Service depende de alguém
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository repo) {
        clienteRepository = repo;
    }

    //Listar todos os clientes
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

}
