package com.bl.encapsulation.libraraysystem;

public class Book extends LibraryItem implements Reservable {
	private boolean isAvailable = true;

	public Book(int id, String title, String author) {
		super(id, title, author);
	}

	public int getLoanDuration() {
		return 14; // days
	}

	public void reserveItem() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println("Book reserved");
		}
	}

	public boolean checkAvailability() {
		return isAvailable;
	}

}
