package com.keteban.spring.pattern.factory.abstracts.bca;

import com.keteban.spring.pattern.factory.abstracts.PaymentChargeRequest;
import com.keteban.spring.pattern.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class BCAChargePaymentRequest implements PaymentChargeRequest {
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee() {
        return 5000L;
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
