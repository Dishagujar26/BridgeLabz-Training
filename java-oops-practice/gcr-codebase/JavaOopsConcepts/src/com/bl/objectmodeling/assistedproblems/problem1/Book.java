package com.bl.objectmodeling.assistedproblems.problem1;

public class Book {

	// attributes
	String bookTitle;
	String authorName;

	// constructor
	Book(String bookTitle, String authorName) {
		this.authorName = authorName;
		this.bookTitle = bookTitle;
	}
	
	// display book detail
	void display() {
		System.out.println("Author Name "+ authorName +" Book Title "+ bookTitle);
	}

}
