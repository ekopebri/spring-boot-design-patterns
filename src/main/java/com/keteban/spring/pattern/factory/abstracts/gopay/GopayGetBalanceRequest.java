package com.keteban.spring.pattern.factory.abstracts.gopay;

import com.keteban.spring.pattern.factory.abstracts.PaymentGetBalanceRequest;
import com.keteban.spring.pattern.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class GopayGetBalanceRequest implements PaymentGetBalanceRequest {
    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }
}
