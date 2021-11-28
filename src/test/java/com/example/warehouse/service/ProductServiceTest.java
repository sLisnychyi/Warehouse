package com.example.warehouse.service;

import com.example.warehouse.dto.ProductAbstractDto;
import com.example.warehouse.dto.ProductDto;
import com.example.warehouse.repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ProductServiceTest {

//    @Test
//    public void when_getProductsCountByType_should_returnProducts(){
//        ProductRepository mock = mock(ProductRepository.class);
//        when(mock.findProductsCountByType())
//                .thenReturn(List.of(
//
//                ));
//
//
//        ProductService productService = new ProductService(mock);
//
//        List<ProductDto> productsCount= productService.getProductsCount();
//
//        Assertions.assertThat(productsCount)
//                .size()
//                .isEqualTo(2);
//
//
//
//
//
//    }
}