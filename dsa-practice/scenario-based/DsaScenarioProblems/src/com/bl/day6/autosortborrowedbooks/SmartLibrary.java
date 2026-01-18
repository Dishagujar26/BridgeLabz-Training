package com.bl.day6.autosortborrowedbooks;

/*
  2. SmartLibrary – Auto-Sort Borrowed Books (Insertion Sort)
Story: A digital kiosk in a library maintains a list of books a user has borrowed. Every time a
new book is issued, the system adds it to the user's list while keeping it alphabetically sorted
by title. Since insertions are done one at a time, and the list is usually already sorted, Insertion
Sort is the perfect fit.

Concepts Involved:
● Insertion Sort
● Dynamic list insertion
● Nearly sorted data
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
  2. SmartLibrary – Auto-Sort Borrowed Books (Insertion Sort)
Story: A digital kiosk in a library maintains a list of books a user has borrowed. Every time a
new book is issued, the system adds it to the user's list while keeping it alphabetically sorted
by title. Since insertions are done one at a time, and the list is usually already sorted, Insertion
Sort is the perfect fit.

Concepts Involved:
● Insertion Sort
● Dynamic list insertion
● Nearly sorted data
 */
public class SmartLibrary {

	public static void insertionSort(List<Book> books) {
		for (int i = 1; i < books.size(); i++) {
			Book key = books.get(i);
			int j = i - 1;

			while (j >= 0 && books.get(j).getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
				books.set(j + 1, books.get(j));
				j--;
			}
			books.set(j + 1, key);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Book> borrowedBooks = new ArrayList<>();

		System.out.print("Enter number of borrowed books: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter book title: ");
			String title = sc.nextLine();
			borrowedBooks.add(new Book(title));
			insertionSort(borrowedBooks); // sort after each insertion
		}

		System.out.println("\nBorrowed Books (Alphabetically Sorted):");
		for (Book b : borrowedBooks) {
			System.out.println(b);
		}
	}
}
