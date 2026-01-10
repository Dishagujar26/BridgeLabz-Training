package com.bl.day7.pharmacysystem;

import java.time.LocalDate;

public class Injection extends Medicine {

	public Injection(String name, LocalDate expiryDate, double price) {
		super(name, expiryDate, price);

	}

	@Override
	public void checkExpiry() {
		if (expiryDate.isBefore(LocalDate.now())) {
			System.out.println(name +" is expired");
		} else {
			System.out.println(name +" is safe to use");

		}
	}
}
