package com.bl.day8.digitalartmarketplace;

public class PrintArt extends Artwork{
	public PrintArt(String title, String artistName, double price) {
		super(title, artistName, price);
	}

	@Override
	public void purchase(User u) {
		u.walletBalance -= price;
		System.out.println("Print art purchased by: "+ u.name+"\nRemaining wallet money: "+u.walletBalance);
	}

	@Override
	public void license() {
		licenseType = "Print Art is licensed for: \n1.Merchandise\n2.Editorial content\n3.Advertising campaigns\n4.Decorative items";
		System.out.println("Art successfully licensed for "+licenseType);

	}
}
