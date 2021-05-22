package com.keteban.spring.pattern.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void productTestBuilder() {
        Product honda = Product
                .builder()
                .id("C001")
                .name("Honda")
                .sku("Unit")
                .price(5_000L)
                .build();

        Product toyota = new Product.ProductBuilder()
                .id("C002")
                .name("Toyota")
                .sku("Unit")
                .price(5_600L)
                .build();

        System.out.println(honda);
        System.out.println(toyota);
    }
}