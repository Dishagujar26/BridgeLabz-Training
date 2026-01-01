package com.bl.inheritance.singleinheritance.librarymanagementsystem;

public class Author extends Book{
	String name;
	String bio;
	
	public Author(String title, int publicationYear, String name, String bio) {
		super(title, publicationYear);
		this.name = name;
		this.bio = bio;
	}
	
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("Name: "+ name);
		System.out.println("Bio: "+ bio);
	}

}
