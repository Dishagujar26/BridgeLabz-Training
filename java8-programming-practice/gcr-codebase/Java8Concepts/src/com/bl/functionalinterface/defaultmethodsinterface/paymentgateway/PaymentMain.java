package com.bl.functionalinterface.defaultmethodsinterface.paymentgateway;
public class PaymentMain {
    public static void main(String[] args) {

        PaymentProcessor payment = new UpiPayment();
        payment.pay(500);
        payment.refund(200);
    }
}
