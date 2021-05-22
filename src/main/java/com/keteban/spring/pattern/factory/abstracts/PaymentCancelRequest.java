package com.keteban.spring.pattern.factory.abstracts;

public interface PaymentCancelRequest {
    String getId();
    void setId(String id);
    PaymentMethod getMethod();
}
