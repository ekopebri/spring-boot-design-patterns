package com.keteban.spring.pattern.factory.abstracts;

public interface PaymentChargeRequest {
    String getId();
    void setId(String id);
    Long getAmount();
    void setAmount(Long amount);
    Long getFee();
    PaymentMethod getMethod();
}
