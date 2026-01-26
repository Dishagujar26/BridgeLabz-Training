package com.bl.regularexpression.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {

	static void extractLinks(String text) {
		Matcher m = Pattern.compile("https?://[^\\s]+").matcher(text);
		while (m.find())
			System.out.println(m.group());
	}

	public static void main(String[] args) {
		String text = "Visit https://google.com and http://example.org";
		Matcher m = Pattern.compile("https?://[^\\s]+").matcher(text);

		while (m.find())
			System.out.println(m.group());
	}
}
