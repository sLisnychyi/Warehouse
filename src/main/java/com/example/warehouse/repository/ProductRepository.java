package com.example.warehouse.repository;

import com.example.warehouse.dto.ProductAbstractDto;
import com.example.warehouse.dto.ProductDto;
import com.example.warehouse.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query(nativeQuery = true, value = "select p.type as type, count(p) as count from products p group by p.type")
    List<ProductAbstractDto> findProductsCountByType();

}
