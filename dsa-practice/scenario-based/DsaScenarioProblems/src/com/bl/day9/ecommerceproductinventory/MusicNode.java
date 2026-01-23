package com.bl.day9.ecommerceproductinventory;

class MusicNode {
	int SKU;
	String productName;
	double productPrice;
	MusicNode left, right;

	public MusicNode(int SKU, String productName, double productPrice) {
		super();
		this.SKU = SKU;
		this.productName = productName;
		this.productPrice = productPrice;
		left = right = null; // initially no children

	}

}
