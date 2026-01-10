package com.bl.day8.digitalartmarketplace;

public class DigitalArt extends Artwork {

	public DigitalArt(String title, String artistName, double price) {
		super(title, artistName, price);
	}

	@Override
	public void purchase(User u) {
		if (price < u.walletBalance) {
			u.walletBalance -= price;
			artDetails();
			System.out.println("Digital art successfully purchased by: " + u.name + "\nRemaining wallet money: "
					+ u.walletBalance);

		} else {
			System.out.println("Insufficient Balance!!");
		}
	}

	@Override
	public void license() {
		licenseType = "Digital Art is licensed for: \n1.Creative Commons (CC) Licenses\n2.NFTs (Non-Fungible Tokens)\n3.Commercial Use License";
		artDetails();
		System.out.println(licenseType);
	}

}
