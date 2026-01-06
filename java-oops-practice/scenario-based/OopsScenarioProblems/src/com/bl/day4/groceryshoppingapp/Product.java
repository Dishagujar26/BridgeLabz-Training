package com.bl.day4.groceryshoppingapp;

public abstract class Product {
	 private String name;
	    private double price;
	    private String category;
	    private int quantity;

	    public Product(String name, double price, String category, int quantity) {
	        this.name = name;
	        this.price = price;
	        this.category = category;
	        this.quantity = quantity;
	    }

	    // Encapsulation: no setter for price
	    public double getPrice() {
	        return price;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public String getName() {
	        return name;
	    }

	    // Polymorphic discount
	    abstract double getDiscount(double total);
}
