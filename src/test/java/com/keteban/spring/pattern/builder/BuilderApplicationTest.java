package com.keteban.spring.pattern.builder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = BuilderApplication.class)
class BuilderApplicationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void testBuilder() {
        Product product = applicationContext.getBean("productGadget", Product.class);
        product.setName("IPhone");
        product.setPrice(20_000_000L);

        System.out.println(product);
    }
}