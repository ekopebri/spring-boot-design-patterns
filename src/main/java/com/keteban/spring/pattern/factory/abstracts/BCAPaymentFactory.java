package com.keteban.spring.pattern.factory.abstracts;

import com.keteban.spring.pattern.factory.abstracts.PaymentCancelRequest;
import com.keteban.spring.pattern.factory.abstracts.PaymentChargeRequest;
import com.keteban.spring.pattern.factory.abstracts.PaymentFactory;
import com.keteban.spring.pattern.factory.abstracts.PaymentGetBalanceRequest;
import com.keteban.spring.pattern.factory.abstracts.bca.BCACancelPaymentRequest;
import com.keteban.spring.pattern.factory.abstracts.bca.BCAChargePaymentRequest;
import com.keteban.spring.pattern.factory.abstracts.bca.BCAGetBalanceRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BCAPaymentFactory implements PaymentFactory {
    @Override
    public PaymentChargeRequest chargeRequest() {
        return new BCAChargePaymentRequest();
    }

    @Override
    public PaymentCancelRequest cancelRequest() {
        return new BCACancelPaymentRequest();
    }

    @Override
    public PaymentGetBalanceRequest getBalanceRequest() {
        return new BCAGetBalanceRequest();
    }
}
