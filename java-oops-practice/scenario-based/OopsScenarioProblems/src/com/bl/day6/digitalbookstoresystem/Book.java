package com.bl.day6.digitalbookstoresystem;

public class Book {
	protected String title;
	protected String author;
	protected double price;
	private int stock;

	public Book(String title, String author, double price, int stock) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}

	public boolean reduceStock(int qty) {
		if (qty <= stock) {
			stock -= qty;
			return true;
		}
		return false;
	}

	public double getPrice() {
		return price;
	}
}
