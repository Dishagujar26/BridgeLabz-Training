package com.bl.encapsulation.libraraysystem;

public class LibraryService {

	public static void main(String[] args) {

		LibraryItem[] items = { new Book(1, "Java Basics", "James Gosling"),
				new Magazine(2, "Tech Monthly", "Editorial"), new DVD(3, "OOP Concepts", "Oracle") };

		for (LibraryItem item : items) {
			item.getItemDetails();
			System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

			if (item instanceof Reservable) {
				Reservable r = (Reservable) item;
				System.out.println("Available: " + r.checkAvailability());
				r.reserveItem();
			}
			System.out.println();
		}
	}

}
