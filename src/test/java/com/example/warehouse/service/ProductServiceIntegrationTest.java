package com.example.warehouse.service;

import com.example.warehouse.model.Product;
import com.example.warehouse.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class ProductServiceIntegrationTest {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService;

    @Test
    public void should_saveAndGetProducts_when_productExist() {
        //given
        Product product = new Product().setName("product1").setPrice(10).setType("test");
        //when
        Product product1 = productRepository.save(product);
        //then
        List<Product> result = productService.getAll();
        assertThat(result).size().isEqualTo(1);
        assertThat(result.get(0)).extracting(Product::getName).isEqualTo("product1");
    }

}
