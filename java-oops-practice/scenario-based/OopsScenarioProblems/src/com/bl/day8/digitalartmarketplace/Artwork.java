package com.bl.day8.digitalartmarketplace;

public abstract class Artwork implements IPurchasable {
	private String title;
	private String artistName;
	protected double price;
	protected String licenseType;

	public Artwork(String title, String artistName, double price) {
		super();
		this.title = title;
		this.artistName = artistName;
		this.price = price;
	}

	public void artDetails() {
		System.out.println("Art Title: "+ title);
		System.out.println("Artist Name: "+ artistName );
		System.out.println("Art Price: "+ price);
	}
	public abstract void purchase(User u);

	public abstract void license();
}
