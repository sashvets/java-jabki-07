package main.payment;

import java.math.BigDecimal;

public class CreditCardPayment extends Payment {

    public CreditCardPayment(BigDecimal amount) {
        super(amount);
    }

    @Override
    public void process() {
        System.out.println("Оплата с помощью кредитной карты");
    }
}