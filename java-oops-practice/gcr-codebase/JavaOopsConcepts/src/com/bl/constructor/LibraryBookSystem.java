package com.bl.constructor;

public class LibraryBookSystem {

	// Attributes 
    String title;
    String author;
    double price;
    boolean availability;
	
	// Parameterized Constructors
	LibraryBookSystem(String title, String author, double price){
	    this.title = title;
		this.author = author;
		this.price = price;
		this.availability = true;
	}
	
	LibraryBookSystem(){
	}
	
	// display Book Details
	void displayBookDetails() {
		System.out.println("Book Name: " + title +"\nAuthor Name: "+ author +"\nBook Price: "+ price+"\nBook Availability "+ availability);
	}
	
	// method to borrow a book
	void borrowBook() {
		if(availability) {
			availability = false;
			System.out.println("Book borrowed successfully!");
		}
		else {
			System.out.println("Book is already borrowed ");
		}
	}
	
	// return the book
	void returnBook(){
		availability = true;
		System.out.println("Book returned successfully!");
	}
	
}
