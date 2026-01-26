package com.bl.day1.smartsurveyanalyzer;

public class Feedback<T> {
	private T type; // e.g., "Service", "Product"
	private String text;
	private int rating; // 0–10

	public Feedback(T type, String text, int rating) {
		this.type = type;
		this.text = text;
		this.rating = rating;
	}

	public T getType() {
		return type;
	}

	public String getText() {
		return text;
	}

	public int getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return type + ": " + text + " (" + rating + "/10)";
	}
}
