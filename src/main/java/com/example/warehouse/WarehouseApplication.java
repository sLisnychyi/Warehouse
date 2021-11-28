package com.example.warehouse;

import com.example.warehouse.aspect.MonitoringAspect;
import com.example.warehouse.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class WarehouseApplication implements CommandLineRunner {
    @Autowired
    ProductService productService;
//    private Logger logger= LoggerFactory.getLogger(WarehouseApplication.class);;

    public static void main(String[] args) {
        SpringApplication.run(WarehouseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        productService.getProductsCount().forEach(e -> log.info("product count {} by type {}", e.getCount(), e.getType()));
    }
}
