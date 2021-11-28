package com.example.warehouse.service;

import com.example.warehouse.dto.ProductAbstractDto;
import com.example.warehouse.dto.ProductDto;
import com.example.warehouse.model.Product;
import com.example.warehouse.repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ProductServiceTest {

    @Test
    public void should_saveAndReturnProduct_when_validProduct() {
        //given
        ProductRepository mock = mock(ProductRepository.class);
        Product product = new Product().setName("product1").setPrice(10).setType("test");
        when(mock.save(product)).thenReturn(product.setId(1));

        ProductService productService = new ProductService(mock);
        //when
        Product result = productService.save(product);
        //then
        assertThat(result).extracting(Product::getId).isEqualTo(1);
    }


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
//    }
}