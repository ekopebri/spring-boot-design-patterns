package com.keteban.spring.pattern.factory.abstracts.gopay;

import com.keteban.spring.pattern.factory.abstracts.PaymentCancelRequest;
import com.keteban.spring.pattern.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class GopayCancelPaymentRequest implements PaymentCancelRequest {

    @Getter
    @Setter
    private String id;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }
}
