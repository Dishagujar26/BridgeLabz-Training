package com.bl.day1.libraryorganizer;

public class Book {
	protected String title;
	protected String authorName;

	public Book(String title, String authorName) {
		super();
		this.title = title;
		this.authorName = authorName;
	}

	public boolean equals(Object o) {
		Book b = (Book) o;
		return title.equals(b.title) && authorName.equals(b.authorName);
	}

	public int hashCode() {
		return title.hashCode() + authorName.hashCode();
	}

	public String toString() {
		return title + " by " + authorName;
	}

}
