package com.keteban.spring.pattern.builder;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class BuilderApplication {

    @Bean
    @Scope("prototype")
    public Product productMobil() {
        return Product
                .builder()
                .category(Category.VEHICLE)
                .build();
    }

    @Bean
    @Scope("prototype")
    public Product productGadget() {
        return Product
                .builder()
                .category(Category.GADGET)
                .build();
    }
}
