package com.keteban.spring.pattern.factory.abstracts;

import com.keteban.spring.pattern.factory.abstracts.PaymentCancelRequest;
import com.keteban.spring.pattern.factory.abstracts.PaymentChargeRequest;
import com.keteban.spring.pattern.factory.abstracts.PaymentFactory;
import com.keteban.spring.pattern.factory.abstracts.PaymentGetBalanceRequest;
import com.keteban.spring.pattern.factory.abstracts.bca.BCACancelPaymentRequest;
import com.keteban.spring.pattern.factory.abstracts.bca.BCAChargePaymentRequest;
import com.keteban.spring.pattern.factory.abstracts.bca.BCAGetBalanceRequest;
import com.keteban.spring.pattern.factory.abstracts.gopay.GopayCancelPaymentRequest;
import com.keteban.spring.pattern.factory.abstracts.gopay.GopayChargePaymentRequest;
import com.keteban.spring.pattern.factory.abstracts.gopay.GopayGetBalanceRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GopayPaymentFactory implements PaymentFactory {
    @Override
    public PaymentChargeRequest chargeRequest() {
        return new GopayChargePaymentRequest();
    }

    @Override
    public PaymentCancelRequest cancelRequest() {
        return new GopayCancelPaymentRequest();
    }

    @Override
    public PaymentGetBalanceRequest getBalanceRequest() {
        return new GopayGetBalanceRequest();
    }
}
