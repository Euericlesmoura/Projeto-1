package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.ItemDoPedido;
import br.com.ecommerce.api.service.ItemDoPedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/itemdopedido")
public class ItemDoPedidoController {

    //Controller <CHAMANDO> Service
    private final ItemDoPedidoService itemDoPedidoService;

    public ItemDoPedidoController (ItemDoPedidoService itemPedido) {

        itemDoPedidoService = itemPedido;
    }

    @GetMapping
    public ResponseEntity<List<ItemDoPedido>> listarTodos() {
        List<ItemDoPedido> itemPedido = itemDoPedidoService.listarTodos();

        return ResponseEntity.ok(itemPedido);
    }
}
