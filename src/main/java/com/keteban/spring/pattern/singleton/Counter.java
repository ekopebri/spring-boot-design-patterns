package com.keteban.spring.pattern.singleton;

public class Counter {
    private Long value = 0L;

    public Long getValue() {
        return value;
    }

    public void increment() {
        value++;
    }
}
