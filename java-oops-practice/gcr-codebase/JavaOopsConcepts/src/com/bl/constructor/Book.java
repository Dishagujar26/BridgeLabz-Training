package com.bl.constructor;

public class Book {

    // Attributes 
    String title;
    String author;
    double price;
	
	// Parameterized Constructors
	Book(String title, String author, double price){
	    this.title = title;
		this.author = author;
		this.price = price;
	}
	
	Book(){
	}
	
	void display() {
		System.out.println("Book Name: " + title +"\nAuthor Name: "+ author +"\nBook Price: "+ price);
	}
	
}
