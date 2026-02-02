package com.bl.functionalinterface.defaultmethodsinterface.paymentgateway;
public interface PaymentProcessor {

    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refund processed: " + amount);
    }
}
