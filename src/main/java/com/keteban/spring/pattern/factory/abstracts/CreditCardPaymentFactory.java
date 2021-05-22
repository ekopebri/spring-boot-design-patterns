package com.keteban.spring.pattern.factory.abstracts;

import com.keteban.spring.pattern.factory.abstracts.PaymentCancelRequest;
import com.keteban.spring.pattern.factory.abstracts.PaymentChargeRequest;
import com.keteban.spring.pattern.factory.abstracts.PaymentFactory;
import com.keteban.spring.pattern.factory.abstracts.PaymentGetBalanceRequest;
import com.keteban.spring.pattern.factory.abstracts.cc.CreditCardCancelPaymentRequest;
import com.keteban.spring.pattern.factory.abstracts.cc.CreditCardChargePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory {
    @Override
    public PaymentChargeRequest chargeRequest() {
        return new CreditCardChargePaymentRequest();
    }

    @Override
    public PaymentCancelRequest cancelRequest() {
        return new CreditCardCancelPaymentRequest();
    }

    @Override
    public PaymentGetBalanceRequest getBalanceRequest() {
        throw new UnsupportedOperationException("Get Balance is not supported in credit card");
    }
}
