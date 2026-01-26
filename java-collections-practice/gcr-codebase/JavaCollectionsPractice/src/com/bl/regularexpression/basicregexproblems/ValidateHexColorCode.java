package com.bl.regularexpression.basicregexproblems;

public class ValidateHexColorCode {
	static boolean validateHexColor(String s) {
		return s.matches("^#[0-9A-Fa-f]{6}$");
	}

	public static void main(String[] args) {
		String color = "#FFA500";
		System.out.println(color.matches("^#[0-9A-Fa-f]{6}$"));
	}
}
