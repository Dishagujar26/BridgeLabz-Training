package com.bl.day6.digitalbookstoresystem;

public class EBook extends Book implements IDiscountable {
	public EBook(String title, String author, double price) {
		super(title, author, price, 9999);
	}

	public double applyDiscount(double price) {
		return price * 0.90;
	}
}
