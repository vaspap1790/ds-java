package com.example.dsjava.behavioral.strategy;

/**
 * Context
 */
public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public void processOrder(int amount){
        paymentStrategy.collectPaymentDetails();
        if(paymentStrategy.validatePaymentDetails()){
            paymentStrategy.pay(amount);
        }
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
