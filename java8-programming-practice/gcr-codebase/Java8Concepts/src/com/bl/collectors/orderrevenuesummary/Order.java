package com.bl.collectors.orderrevenuesummary;
class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    String getCustomer() { return customer; }
    double getAmount() { return amount; }
}