package com.example.dsjava.behavioral.strategy;

/**
 * Strategy
 */
public interface PaymentStrategy {
    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(int amount);
}
