package com.bl.day7.pharmacysystem;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {
	protected String name;
	protected LocalDate expiryDate;
	protected int quantity;
	private double price;
	
    // for default quantity
	public Medicine(String name, LocalDate expiryDate, double price) {
		super();
		this.name = name;
		this.expiryDate = expiryDate;
		this.price = price;
	}
	
	// for custom quantity
		public Medicine(String name, LocalDate expiryDate, double price, int quantity) {
			super();
			this.name = name;
			this.expiryDate = expiryDate;
			this.price = price;
			this.quantity = quantity;
		}
	
    public int getQuantity() {
    	return quantity;
    }
	
	public double applyDiscount(double total){
		if(total > 500) {
			total = total * 0.9;
			return total;
		}
		return total;
	}
	
	@Override
	public void sell(int qty) {
		if(quantity > qty) {
			double total = price * qty;
			total = applyDiscount(total);
		   quantity -= qty;
		   System.out.println(name +" sold.\nTotal Quantity Sold: "+ qty);
		}
		else {
			System.out.println("Insufficient Stock");
		}
	}
	abstract void checkExpiry();
}
