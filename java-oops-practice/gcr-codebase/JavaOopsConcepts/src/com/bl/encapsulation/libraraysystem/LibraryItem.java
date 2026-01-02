package com.bl.encapsulation.libraraysystem;

public abstract class LibraryItem {
	private int itemId;
	private String title;
	private String author;
	private String borrowerName; // sensitive data

	public LibraryItem(int itemId, String title, String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}

	// Encapsulation
	protected void setBorrowerName(String name) {
		this.borrowerName = name;
	}

	protected String getBorrowerName() {
		return borrowerName;
	}

	public abstract int getLoanDuration();

	public void getItemDetails() {
		System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
	}

}
