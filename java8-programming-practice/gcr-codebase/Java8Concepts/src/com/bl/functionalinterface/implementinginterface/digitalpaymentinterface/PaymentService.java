package com.bl.functionalinterface.implementinginterface.digitalpaymentinterface;

public class PaymentService {
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(500);
        card.pay(1500);
        wallet.pay(300);
    }
}
