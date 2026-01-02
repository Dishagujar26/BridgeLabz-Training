package com.bl.encapsulation.onlinefooddelivery;

public class NonVegItem extends FoodItem {

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50; // extra charge
    }
}
