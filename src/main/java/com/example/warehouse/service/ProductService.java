package com.example.warehouse.service;

import com.example.warehouse.aspect.Monitoring;
import com.example.warehouse.dto.ProductDto;
import com.example.warehouse.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    @Monitoring
    public List<ProductDto> getProductsCount() {
        return productRepository.findProductsCountByType();
    }

}
