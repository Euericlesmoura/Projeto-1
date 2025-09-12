package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.model.Pedido;
import br.com.ecommerce.api.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService (PedidoRepository repo) {

        pedidoRepository = repo;
    }

    //Metodo listar
    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();

    }

    //Metodo Cadastrar
    public Pedido cadastrarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    //Metodo Buscar
    public Pedido buscarPedidoPorId (Integer id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    //Metodo Deletar
    public Pedido deletarPedido (Integer id) {

        //1. Verificar se o cliente existe
        Pedido pedido = buscarPedidoPorId(id);

        //2. Se não existir, retornar nulo
        if (pedido == null) {
            return null;
        }

        //3. Se existir, excluo
        pedidoRepository.delete(pedido);
        return pedido;
    }

    //Metodo Atualizar
    public Pedido atualizarPedido (Integer id, Pedido pedido) {

        //1. Procurar quem eu quero atualizar
        Pedido pedidoAntigo = buscarPedidoPorId(id);

        //2. Se eu não encontrar, retorno nulo
        if (pedidoAntigo == null) {
            return null;
        }

        //3. Se eu achar, eu atualizo
        pedidoAntigo.setDataPedido(pedido.getDataPedido());
        pedidoAntigo.setStatus(pedido.getStatus());
        pedidoAntigo.setValorTotal(pedido.getValorTotal());
        return pedidoRepository.save(pedidoAntigo);
    }
}
