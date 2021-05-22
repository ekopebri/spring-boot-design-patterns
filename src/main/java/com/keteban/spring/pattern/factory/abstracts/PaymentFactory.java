package com.keteban.spring.pattern.factory.abstracts;

public interface PaymentFactory {
    PaymentChargeRequest chargeRequest();
    PaymentCancelRequest cancelRequest();
    PaymentGetBalanceRequest getBalanceRequest();
}
