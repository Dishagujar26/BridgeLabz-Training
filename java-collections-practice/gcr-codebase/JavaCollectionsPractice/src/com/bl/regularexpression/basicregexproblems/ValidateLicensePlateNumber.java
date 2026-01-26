package com.bl.regularexpression.basicregexproblems;

public class ValidateLicensePlateNumber {

	static boolean validateLicense(String s) {
		return s.matches("^[A-Z]{2}\\d{4}$");
	}

	public static void main(String[] args) {
		String plate = "AB1234";
		System.out.println(plate.matches("^[A-Z]{2}\\d{4}$"));
	}
}
