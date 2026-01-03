package com.bl.linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryMain {
	public static void main(String[] args) {
		Library lib = new Library();

		lib.addAtEnd(101, "Java Basics", "James", "Programming", true);
		lib.addAtBeginning(102, "Data Structures", "Mark", "CS", true);
		lib.addAtPosition(2, 103, "Operating Systems", "Andrew", "CS", false);

		lib.displayForward();

		lib.searchByAuthor("Mark");
		lib.updateAvailability(103, true);

		System.out.println("Reverse Order:");
		lib.displayReverse();

		lib.countBooks();
		lib.removeById(101);
		lib.displayForward();
	}
}
