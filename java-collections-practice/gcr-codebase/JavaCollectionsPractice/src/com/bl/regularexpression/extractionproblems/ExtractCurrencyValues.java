package com.bl.regularexpression.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValues {
	static void extractCurrency(String text) {
		Matcher m = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(text);
		while (m.find())
			System.out.println(m.group());
	}

	public static void main(String[] args) {
		String text = "Price $45.99 and discount 10.50";
		Matcher m = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(text);

		while (m.find())
			System.out.println(m.group());
	}
}
