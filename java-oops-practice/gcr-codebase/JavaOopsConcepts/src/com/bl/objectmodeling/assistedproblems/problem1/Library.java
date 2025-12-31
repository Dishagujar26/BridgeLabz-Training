package com.bl.objectmodeling.assistedproblems.problem1;

import java.util.ArrayList;
import java.util.List;

public class Library {

	// attribute
	String name;
	List<Book> books = new ArrayList<>();

	// constructor
	Library(String name) {
		this.name = name;
	}

	// add books
	public void addBook(Book b) {
		books.add(b);
	}

	// show all books in a particular library
	void showBooks() {
		System.out.println("Library: " + name);
		for (Book b : books) {
			b.display();
		}
		System.out.println();
	}

}
