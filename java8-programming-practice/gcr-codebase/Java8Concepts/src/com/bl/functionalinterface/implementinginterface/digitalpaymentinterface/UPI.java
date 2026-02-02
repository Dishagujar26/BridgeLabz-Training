package com.bl.functionalinterface.implementinginterface.digitalpaymentinterface;

public class UPI implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI");
    }
}

