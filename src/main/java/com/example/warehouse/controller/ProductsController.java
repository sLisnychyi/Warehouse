package com.example.warehouse.controller;

import com.example.warehouse.model.Product;
import com.example.warehouse.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductsController {
    private final ProductService productService;
    private final SimpMessagingTemplate template;

    @MessageMapping("/products")
    public void processProduct(Product product) {
        Product result = productService.save(product);

        template.convertAndSend("/topic", result);
    }
}
