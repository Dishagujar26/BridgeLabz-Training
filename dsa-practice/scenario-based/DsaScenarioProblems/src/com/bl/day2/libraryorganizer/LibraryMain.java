package com.bl.day3.libraryorganizer;

import java.util.Scanner;

public class LibraryMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LibraryShelf shelf = new LibraryShelf();

		Book b1 = new Book("Harry Potter", "J K Rowling");
		Book b2 = new Book("The Hobbit", "Tolkien");
		Book b3 = new Book("Clean Code", "Robert Martin");
		Book b4 = new Book("Brief History of Time", "Stephen Hawking");

		shelf.addInternal("Fantasy", b1);
		shelf.addInternal("Fantasy", b2);
		shelf.addInternal("Programming", b3);
		shelf.addInternal("Science", b4);

		boolean running = true;

		while (running) {

			System.out.println("\nWhat do you want to do?");
			System.out.println("1. Borrow Book");
			System.out.println("2. Return/Add Book");
			System.out.println("3. Exit");

			int choice = sc.nextInt();
			sc.nextLine(); // clear buffer

			if (choice == 2) { // Return / Add
				System.out.println("\nHere is the catalog of books genre wise\n");
				shelf.displayCatalog();

				System.out.println("\nEnter the genre type");
				String genre = sc.nextLine();

				System.out.println("Enter the name of the book");
				String name = sc.nextLine();

				System.out.println("Enter the author name");
				String authorName = sc.nextLine();

				Book b5 = new Book(name, authorName);
				shelf.add(genre, b5);
			}

			else if (choice == 1) { // Borrow
				System.out.println("\nHere is the catalog of books genre wise\n");
				shelf.displayCatalog();

				System.out.println("\nEnter the genre type");
				String genre = sc.nextLine();

				System.out.println("Enter the name of the book");
				String name = sc.nextLine();

				System.out.println("Enter the author name");
				String authorName = sc.nextLine();

				Book b5 = new Book(name, authorName);
				shelf.borrow(genre, b5);
			}

			else if (choice == 3) {
				running = false;
				System.out.println("Thank you for using the Library System!");
			}

			else {
				System.out.println("Invalid Choice!!");
			}
		}

		sc.close();
	}

}
