package com.bl.regularexpression.replaceandmodifystrings;

public class ReplaceMultipleSpaces {
	static String normalizeSpaces(String text) {
		return text.replaceAll("\\s+", " ");
	}

	public static void main(String[] args) {
		String text = "This   is    spaced";
		System.out.println(text.replaceAll("\\s+", " "));
	}

}
