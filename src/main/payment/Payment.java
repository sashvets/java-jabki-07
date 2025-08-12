package main.payment;

import java.math.BigDecimal;

public abstract class Payment {

    private BigDecimal amount;

    public Payment(BigDecimal amount) {
        this.amount = amount;
    }

    public void validate() {
        System.out.println("Проверка данных платежа");
    }

    public abstract void process();

    public void complete() {
        System.out.println("Процесс оплаты завершен");
    }
}