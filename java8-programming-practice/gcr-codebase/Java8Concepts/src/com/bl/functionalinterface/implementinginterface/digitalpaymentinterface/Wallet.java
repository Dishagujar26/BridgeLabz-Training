package com.bl.functionalinterface.implementinginterface.digitalpaymentinterface;

public class Wallet implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Wallet");
    }
}
