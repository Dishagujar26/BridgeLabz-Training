package com.bl.regularexpression.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNames {
	static void extractLanguages(String text) {
		Matcher m = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);
		while (m.find())
			System.out.println(m.group());
	}

	public static void main(String[] args) {
		String text = "I love Java, Python, JavaScript and Go";
		Matcher m = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);

		while (m.find())
			System.out.println(m.group());
	}
}
