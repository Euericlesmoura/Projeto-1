package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Pedido;
import br.com.ecommerce.api.service.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {

    //Controller <CHAMANDO> Service
    private final PedidoService pedidoService;

    public PedidoController (PedidoService pedido) {

        pedidoService = pedido;
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> listarPedidos() {

        List<Pedido> pedido = pedidoService.listarTodos();

        return ResponseEntity.ok(pedido);
    }
}
