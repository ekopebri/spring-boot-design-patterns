package com.keteban.spring.pattern.builder;

import lombok.*;

@Builder
@Data
public class Product {
    private String id;
    private String name;
    private Category category;
    private String sku;
    private Long price;
}
