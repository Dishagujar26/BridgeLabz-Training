package com.bl.regularexpression.basicregexproblems;

public class ValidateSSN {
	static boolean validateSSN(String s) {
		return s.matches("^\\d{3}-\\d{2}-\\d{4}$");
	}

	public static void main(String[] args) {
		String ssn = "123-45-6789";
		System.out.println(ssn.matches("^\\d{3}-\\d{2}-\\d{4}$"));
	}
}
