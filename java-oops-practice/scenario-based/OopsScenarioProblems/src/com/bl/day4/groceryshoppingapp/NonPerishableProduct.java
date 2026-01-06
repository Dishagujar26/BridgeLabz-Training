package com.bl.day4.groceryshoppingapp;

public class NonPerishableProduct extends Product{
	 public NonPerishableProduct(String name, double price, int quantity) {
	        super(name, price, "Non-Perishable", quantity);
	    }

	    @Override
	    double getDiscount(double total) {
	        return total * 0.05; // 5% discount
	    }
}
