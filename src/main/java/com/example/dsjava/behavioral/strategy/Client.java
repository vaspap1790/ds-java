package com.example.dsjava.behavioral.strategy;

/**
 * Strategy: Defines a family of algorithms, puts each in a separate class and makes their objects interchangeable
 * Use case: when there are multiple implementations for a specific task
 * Strategies are completely independent and unaware of each other, but they all accomplish the same thing
 * Different strategies can be applied on runtime (Liskov Substitution Principle, Polymorphism)
 * Avoids if/else or switch statements in the Client (Open/Closed Principle)
 * Decouples the responsibilities (Single Responsibility Principle)
 * Inverts the dependency as now the client depends on the abstraction (Dependency Inversion)
 */
public class Client {
    static final int AMOUNT = 10;
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new PaymentByCreditCard());
        paymentService.processOrder(AMOUNT);
    }
}
