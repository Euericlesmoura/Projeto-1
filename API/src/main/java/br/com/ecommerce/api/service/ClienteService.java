package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    //Injeção de Dependência
    //Falar que Service depende de alguém
    //final - significa que é constante
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository repo) {
        clienteRepository = repo;
    }

    //Listar todos os clientes
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    //INSERT INTO ..    método de cadastrar
    public Cliente cadastrarCliente (Cliente cl) {
        return clienteRepository.save(cl);
    }

    //Buscar
    public Cliente buscarPorId(Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }

    //Deletar
    public Cliente deletarCliente (Integer id) {

        //1. Verificar se o cliente existe
        Cliente cliente = buscarPorId(id);

        //2. Se não existir, retornar nulo
        if (cliente == null) {
            return null;
        }

        //3. Se existir, excluo
        clienteRepository.delete(cliente);
        return cliente;
    }

    //Metodo Atualizar
    public Cliente atualizarCliente (Integer id, Cliente clienteNovo) {

        //1. Procurar quem eu quero atualizar
        Cliente clienteAntigo = buscarPorId(id);

        //2. Se eu não encontrar, retorno nulo
        if (clienteAntigo == null) {
            return null;
        }

        //3. Se eu achar, eu atualizo
        clienteAntigo.setDataCadastro(clienteNovo.getDataCadastro());
        clienteAntigo.setSenha(clienteNovo.getSenha());
        clienteAntigo.setEmail(clienteNovo.getEmail());
        clienteAntigo.setNomeCompleto(clienteNovo.getNomeCompleto());
        clienteAntigo.setTelefone(clienteNovo.getTelefone());
        return clienteRepository.save(clienteAntigo);
    }

}