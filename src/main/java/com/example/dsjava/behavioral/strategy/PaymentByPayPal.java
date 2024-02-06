package com.example.dsjava.behavioral.strategy;

public class PaymentByPayPal implements PaymentStrategy {
    @Override
    public void collectPaymentDetails() {
        // business logic specific to PayPal
    }

    @Override
    public boolean validatePaymentDetails() {
        // business logic specific to PayPal
        return false;
    }

    @Override
    public void pay(int amount) {
        // business logic specific to PayPal
    }
}
