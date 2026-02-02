package com.bl.functionalinterface.defaultmethodsinterface.paymentgateway;

public class UpiPayment implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("UPI payment: " + amount);
    }
}
