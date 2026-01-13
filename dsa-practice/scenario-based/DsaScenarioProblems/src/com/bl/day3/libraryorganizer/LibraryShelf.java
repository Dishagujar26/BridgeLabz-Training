package com.bl.day3.libraryorganizer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LibraryShelf {

	HashMap<String, List<Book>> catalog = new HashMap<>();
	HashSet<Book> uniqueBooks = new HashSet<>();
	
	void addInternal(String genre, Book book) {
        if (uniqueBooks.contains(book)) return;

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        uniqueBooks.add(book);
    }

	// adding/returning book to shelf as per genre
	public void add(String genre, Book book) {
		if (uniqueBooks.contains(book)) {
			System.out.println("Sorry, book already exist in shelf!!");
			return;
		}

		// check if that genre exist in HashMap if not then create one with empty list
		catalog.putIfAbsent(genre, new LinkedList<>());
		// add book to specific genre book list
		catalog.get(genre).add(book);
		// add book to unique books
		uniqueBooks.add(book);
		System.out.println(book + " with " + genre + " successfully added to the shelf!");
	}

	// borrow book to shelf as per genre
	public void borrow(String genre, Book book) {
		List<Book> list = catalog.get(genre); // get that specific genre list
		// book needs to be removed from both the list genre list in HashMap and in
		// unique books list

		if (list != null && list.remove(book)) {
			uniqueBooks.remove(book);
			System.out.println(book + " with " + genre + " successfully borrowed from the library shelf!");
		}
		else {
			System.out.println("Sorry, we couldn't find the book!");
		}
	}
	
	// Display genre wise catalog
    void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println(genre + " : " + catalog.get(genre));
        }
    }

}
