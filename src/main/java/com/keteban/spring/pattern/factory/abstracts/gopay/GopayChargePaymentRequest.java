package com.keteban.spring.pattern.factory.abstracts.gopay;

import com.keteban.spring.pattern.factory.abstracts.PaymentChargeRequest;
import com.keteban.spring.pattern.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class GopayChargePaymentRequest implements PaymentChargeRequest {
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee() {
        return 1000L;
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }
}
