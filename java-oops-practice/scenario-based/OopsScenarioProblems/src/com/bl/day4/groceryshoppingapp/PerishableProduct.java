package com.bl.day4.groceryshoppingapp;

public class PerishableProduct extends Product {
	 public PerishableProduct(String name, double price, int quantity) {
	        super(name, price, "Perishable", quantity);
	    }

	    @Override
	    double getDiscount(double total) {
	        return total * 0.10; // 10% discount
	    }

}
