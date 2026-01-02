package com.bl.encapsulation.libraraysystem;

public class Magazine extends LibraryItem implements Reservable{
	private boolean isAvailable = true;

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Magazine reserved");
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }

}
