package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Cliente;
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

    public EnderecoDeEntrega buscarPorId(Integer id) {
        return enderecoDeEntregaRepository.findById(id).orElse(null);
    }

    public EnderecoDeEntrega deletarEndereco (Integer id) {

        EnderecoDeEntrega endereco = buscarPorId(id);

        if (endereco == null) {
            return null;
        }

        enderecoDeEntregaRepository.delete(endereco);
        return endereco;
    }

    public EnderecoDeEntrega atualizarEndereco (Integer id, EnderecoDeEntrega enderecoNovo) {

        //1. Procurar quem eu quero atualizar
        EnderecoDeEntrega enderecoAntigo = buscarPorId(id);

        //2. Se eu não encontrar, retorno nulo
        if (enderecoAntigo == null) {
            return null;
        }

        //3. Se eu achar, eu atualizo
        enderecoAntigo.setBairro(enderecoNovo.getBairro());
        enderecoAntigo.setCep(enderecoNovo.getCep());
        enderecoAntigo.setCidade(enderecoNovo.getCidade());
        enderecoAntigo.setEstado(enderecoNovo.getEstado());
        enderecoAntigo.setComplemento(enderecoNovo.getComplemento());
        enderecoAntigo.setNumero(enderecoNovo.getNumero());
        enderecoAntigo.setLogradouro(enderecoNovo.getLogradouro());
        return enderecoDeEntregaRepository.save(enderecoAntigo);
    }
}
