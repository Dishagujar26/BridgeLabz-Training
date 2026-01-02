package com.bl.encapsulation.onlinefooddelivery;

public abstract class FoodItem {
	private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " x " + quantity);
    }
}
