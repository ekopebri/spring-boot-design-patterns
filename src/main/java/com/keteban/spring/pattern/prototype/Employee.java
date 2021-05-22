package com.keteban.spring.pattern.prototype;

import lombok.Data;

@Data
public class Employee {
    private String id;
    private String name;
    private Position position;
    private Long salary;
}
