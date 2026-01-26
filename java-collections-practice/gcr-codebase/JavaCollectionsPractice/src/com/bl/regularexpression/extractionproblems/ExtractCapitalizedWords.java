package com.bl.regularexpression.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizedWords {
	static void extractCapitalWords(String text) {
		Matcher m = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);
		while (m.find())
			System.out.println(m.group());
	}

	public static void main(String[] args) {
		String text = "The Eiffel Tower is in Paris and New York";
		Matcher m = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);

		while (m.find())
			System.out.println(m.group());
	}
}
