package com.bl.constructor;

import java.util.Scanner;

public class BooksMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        System.out.print("Enter File Size (MB): ");
        double fileSize = sc.nextDouble();

        EBook ebook = new EBook(isbn, title, author, fileSize);

        ebook.displayEBookDetails();

        sc.nextLine(); // buffer clear

        // Modify private author using setter
        System.out.print("\nEnter Updated Author Name: ");
        String newAuthor = sc.nextLine();

        ebook.setAuthor(newAuthor);
        System.out.println("Updated Author: " + ebook.getAuthor());

        sc.close();
	}
}
