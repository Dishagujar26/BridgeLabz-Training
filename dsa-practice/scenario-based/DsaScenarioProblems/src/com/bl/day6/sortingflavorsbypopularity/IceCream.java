package com.bl.day6.sortingflavorsbypopularity;

public class IceCream {
	private String flavor;
	private int sales;

	public IceCream(String flavor, int sales) {
		this.flavor = flavor;
		this.sales = sales;
	}

	public int getSales() {
		return sales;
	}

	@Override
	public String toString() {
		return flavor + " : " + sales;
	}
}
