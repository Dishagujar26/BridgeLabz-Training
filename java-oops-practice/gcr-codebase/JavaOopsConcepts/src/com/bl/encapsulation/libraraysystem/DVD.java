package com.bl.encapsulation.libraraysystem;

public class DVD extends LibraryItem implements Reservable{

	private boolean isAvailable = true;

	public DVD(int id, String title, String author) {
		super(id, title, author);
	}

	public int getLoanDuration() {
		return 3;
	}

	public void reserveItem() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println("DVD reserved");
		}
	}

	public boolean checkAvailability() {
		return isAvailable;
	}
}
