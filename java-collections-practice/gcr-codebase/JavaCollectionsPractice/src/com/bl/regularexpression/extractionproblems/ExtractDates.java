package com.bl.regularexpression.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {

	static void extractDates(String text) {
		Matcher m = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(text);
		while (m.find())
			System.out.println(m.group());
	}

	public static void main(String[] args) {
		String text = "Dates: 12/05/2023, 15/08/2024";
		Matcher m = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(text);

		while (m.find())
			System.out.println(m.group());
	}
}
