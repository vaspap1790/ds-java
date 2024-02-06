package com.example.dsjava.behavioral.strategy;

public class PaymentByCreditCard implements PaymentStrategy {
    @Override
    public void collectPaymentDetails() {
        // business logic specific to credit card
    }

    @Override
    public boolean validatePaymentDetails() {
        // business logic specific to credit card
        return false;
    }

    @Override
    public void pay(int amount) {
        // business logic specific to credit card
    }
}
