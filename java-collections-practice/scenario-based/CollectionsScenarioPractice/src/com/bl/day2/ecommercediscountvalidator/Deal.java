package com.bl.day2.ecommercediscountvalidator;

import java.time.LocalDate;

public class Deal extends Promotion {
	private int discountPercent;
	private int minimumPurchase;

	public Deal(String dealCode, LocalDate validTill, int discountPercent, int minimumPurchase) {
		this.dealCode = dealCode;
		this.validTill = validTill;
		this.discountPercent = discountPercent;
		this.minimumPurchase = minimumPurchase;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	@Override
	public String toString() {
		return dealCode + " | " + discountPercent + "% | Valid Till: " + validTill + " | Min Purchase: "
				+ minimumPurchase;
	}
}
