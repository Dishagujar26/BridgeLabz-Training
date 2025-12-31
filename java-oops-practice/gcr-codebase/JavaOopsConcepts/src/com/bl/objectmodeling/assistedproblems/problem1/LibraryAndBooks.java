package com.bl.objectmodeling.assistedproblems.problem1;

public class LibraryAndBooks {
	
	public static void main(String []args) {
		
        // Aggregation is a HAS-A relationship where objects are related but can exist independently.	
		// A Library has Books, but a Book can exist without a Library 
		// Library uses Book objects. Library does not own the life-cycle of Book. If Library is deleted -> Books still exist that is why aggregation not composition
		
		// create books objects
		Book b1 = new Book("A Little Life","Haniya Yanagihara");
		Book b2 = new Book("The Kite Runner","Khalid Hussaini");
		Book b3 = new Book("Clean Code", "Robert C. Martin");
        Book b4 = new Book("Effective Java", "Joshua Bloch");

        Library library1 = new Library("Central Library");
        Library library2 = new Library("State Library");
        
        // add to particular library 
        library1.addBook(b1);
        library1.addBook(b2);
        library2.addBook(b3);
        library2.addBook(b4);
        
        // books in library1
        library1.showBooks();
        
        // books in library2
        library2.showBooks();

        
	}

}
