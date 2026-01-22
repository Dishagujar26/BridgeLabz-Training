package com.bl.day9.sortingdeliverydeadline;

import java.time.LocalDate;

public class ClothingOrder {
	String name;
	LocalDate date;

	public ClothingOrder(String name, LocalDate date) {
		super();
		this.name = name;
		this.date = date;
	}

	@Override
	public String toString() {
		return name + " - " + date;
	}

}
