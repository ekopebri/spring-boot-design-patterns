package com.keteban.spring.pattern.factory.abstracts;

public interface PaymentGetBalanceRequest {
    String getUserId();
    void setUserId(String userId);
    PaymentMethod getMethod();
}
