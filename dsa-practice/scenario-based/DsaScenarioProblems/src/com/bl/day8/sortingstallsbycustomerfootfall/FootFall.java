package com.bl.day8.sortingstallsbycustomerfootfall;

public class FootFall {

	public String stallName;
	public int totalCustomer;

	public FootFall(String stallName, int stallNumber, int totalCustomer) {
		super();
		this.stallName = stallName;
		this.totalCustomer = totalCustomer;
	}

	@Override
	public String toString() {
		return "stallName = " + stallName + ", totalCustomer = " + totalCustomer;
	}

}
