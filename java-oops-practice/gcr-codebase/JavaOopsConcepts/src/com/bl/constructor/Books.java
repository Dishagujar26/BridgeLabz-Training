package com.bl.constructor;

public class Books {
	
	// Access modifiers
    public String ISBN;        
    protected String title;    
    private String author;     

    // Constructor
    Books(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public methods to access private author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}

class EBook extends Books {

    double fileSize; 
    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);       
        System.out.println("Title: " + title);  
        System.out.println("Author: " + getAuthor()); // public getter
        System.out.println("File Size: " + fileSize + " MB");
    }
}
