package com.keteban.spring.pattern.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductBuilderTest {

    @Test
    void testBuilder() {
        Product product = new ProductBuilder()
                .setId("C001")
                .setName("Car")
                .setSku("Unit")
                .setPrice(7_800L)
                .build();

        System.out.println(product);
    }
}