package com.bl.regularexpression.replaceandmodifystrings;

public class CensorBadWords {
	static String censorWords(String text) {
		return text.replaceAll("\\b(damn|stupid)\\b", "****");
	}

	public static void main(String[] args) {
		String text = "This is a damn stupid example";
		System.out.println(text.replaceAll("\\b(damn|stupid)\\b", "****"));
	}
}
