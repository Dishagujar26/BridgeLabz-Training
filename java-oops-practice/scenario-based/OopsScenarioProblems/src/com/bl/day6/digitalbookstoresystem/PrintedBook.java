package com.bl.day6.digitalbookstoresystem;

public class PrintedBook extends Book implements IDiscountable {
	public PrintedBook(String title, String author, double price, int stock) {
		super(title, author, price, stock);
	}

	public double applyDiscount(double price) {
		return price * 0.85;
	}
}
