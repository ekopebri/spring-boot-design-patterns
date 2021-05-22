package com.keteban.spring.pattern.factory.abstracts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = AbstractFactoryApplication.class)
class AbstractFactoryApplicationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void testAbstractFactory() {
        PaymentFactory cc = applicationContext.getBean(CreditCardPaymentFactory.class);

        charge(cc);
        cancel(cc);
        getBalance(cc);
    }

    public void charge(PaymentFactory paymentFactory) {
        PaymentChargeRequest request = paymentFactory.chargeRequest();
        request.setId("XXX");
        request.setAmount(19_000L);

        System.out.println(request.getAmount());
    }

    public void cancel(PaymentFactory paymentFactory) {
        PaymentCancelRequest request = paymentFactory.cancelRequest();
        request.setId("XXX");

        System.out.println(request.getMethod());
    }

    public Long getBalance(PaymentFactory paymentFactory) {
        try {
            PaymentGetBalanceRequest request = paymentFactory.getBalanceRequest();
            request.setUserId("XXX");

            System.out.println(request);

            return 1000L;
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
            return 0L;
        }
    }

}