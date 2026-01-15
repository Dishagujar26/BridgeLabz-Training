package com.bl.day9.mobilegamedistributionplatform;

public class Game {
	protected String title;
	protected String genre;
	protected double price;
	protected double rating;

	// Constructor for free or paid games
	public Game(String title, String genre, double price, double rating) {
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.rating = rating;
	}

	public double getPrice() {
		return price;
	}

	// Operator usage for seasonal offers
	public double applyOffer(double percent) {
		return price - (price * percent / 100);
	}
}
