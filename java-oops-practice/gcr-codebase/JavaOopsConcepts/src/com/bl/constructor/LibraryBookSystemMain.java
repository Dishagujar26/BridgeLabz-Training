package com.bl.constructor;

import java.util.Scanner;

public class LibraryBookSystemMain {
 
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Book Name ");
		String bookName = sc.next();
		
		System.out.println("Enter Book Author ");
		String authorName = sc.next();
		
		System.out.println("Enter Book Price ");
		double bookPrice = sc.nextDouble();
		
		LibraryBookSystem b1 = new LibraryBookSystem(bookName,authorName,bookPrice);
		b1.displayBookDetails();
		
		System.out.println("Do you want to borrow book? (yes/no)");
		String choice = sc.next();
		
		if(choice.equalsIgnoreCase("yes")) {
			b1.borrowBook();
		}
		
		System.out.println("Do you want to borrow book? (yes/no)");
		String choice2 = sc.next();
		
		if(choice2.equalsIgnoreCase("yes")) {
			b1.returnBook();
		}
		
		sc.close();
	}
}
