package com.bl.linkedlist.doublylinkedlist.librarymanagementsystem;

public class Library {

	private BookNode head;
	private BookNode tail;

	// Add at beginning
	public void addAtBeginning(int id, String title, String author, String genre, boolean available) {
		BookNode node = new BookNode(id, title, author, genre, available);
		if (head == null) {
			head = tail = node;
			return;
		}
		node.next = head;
		head.prev = node;
		head = node;
	}

	// Add at end
	public void addAtEnd(int id, String title, String author, String genre, boolean available) {
		BookNode node = new BookNode(id, title, author, genre, available);
		if (tail == null) {
			head = tail = node;
			return;
		}
		tail.next = node;
		node.prev = tail;
		tail = node;
	}

	// Add at specific position (1-based)
	public void addAtPosition(int pos, int id, String title, String author, String genre, boolean available) {
		if (pos == 1) {
			addAtBeginning(id, title, author, genre, available);
			return;
		}
		BookNode temp = head;
		for (int i = 1; i < pos - 1 && temp != null; i++)
			temp = temp.next;

		if (temp == null) {
			System.out.println("Invalid position");
			return;
		}

		BookNode node = new BookNode(id, title, author, genre, available);
		node.next = temp.next;
		node.prev = temp;

		if (temp.next != null)
			temp.next.prev = node;
		else
			tail = node;

		temp.next = node;
	}

	// Remove by Book ID
	public void removeById(int id) {
		BookNode temp = head;
		while (temp != null && temp.bookId != id)
			temp = temp.next;

		if (temp == null) {
			System.out.println("Book not found");
			return;
		}

		if (temp.prev != null)
			temp.prev.next = temp.next;
		else
			head = temp.next;

		if (temp.next != null)
			temp.next.prev = temp.prev;
		else
			tail = temp.prev;
	}

	// Search by title
	public void searchByTitle(String title) {
		BookNode temp = head;
		while (temp != null) {
			if (temp.title.equalsIgnoreCase(title)) {
				displayBook(temp);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Book not found");
	}

	// Search by author
	public void searchByAuthor(String author) {
		BookNode temp = head;
		while (temp != null) {
			if (temp.author.equalsIgnoreCase(author)) {
				displayBook(temp);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Book not found");
	}

	// Update availability
	public void updateAvailability(int id, boolean status) {
		BookNode temp = head;
		while (temp != null) {
			if (temp.bookId == id) {
				temp.isAvailable = status;
				System.out.println("Availability updated");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Book not found");
	}

	// Display forward
	public void displayForward() {
		BookNode temp = head;
		while (temp != null) {
			displayBook(temp);
			temp = temp.next;
		}
	}

	// Display reverse
	public void displayReverse() {
		BookNode temp = tail;
		while (temp != null) {
			displayBook(temp);
			temp = temp.prev;
		}
	}

	// Count total books
	public void countBooks() {
		int count = 0;
		BookNode temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		System.out.println("Total books: " + count);
	}

	private void displayBook(BookNode b) {
		System.out.println(
				b.bookId + " | " + b.title + " | " + b.author + " | " + b.genre + " | Available: " + b.isAvailable);
	}

}
