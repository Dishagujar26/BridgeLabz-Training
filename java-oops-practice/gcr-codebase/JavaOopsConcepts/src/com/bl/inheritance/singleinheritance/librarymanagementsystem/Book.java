package com.bl.inheritance.singleinheritance.librarymanagementsystem;

public class Book {
	String title;
	int publicationYear;

	public Book(String title, int publicationYear) {
		this.title = title;
		this.publicationYear = publicationYear;
	}

	void displayInfo() {
		System.out.println("Title: " + title);
		System.out.println("Publication Year " + publicationYear);
	}
}
