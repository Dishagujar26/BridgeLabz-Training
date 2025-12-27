package com.bl.constructor;

import java.util.Scanner;

public class BookMain {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book Name:");
        String bookName = sc.nextLine();   

        System.out.println("Enter Book Author:");
        String authorName = sc.nextLine();

        System.out.println("Enter Book Price:");
        double bookPrice = sc.nextDouble();

        Book b1 = new Book(bookName, authorName, bookPrice);
        b1.display();

        sc.close();
    }

}
