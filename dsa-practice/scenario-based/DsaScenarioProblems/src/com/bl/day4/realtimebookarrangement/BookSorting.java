package com.bl.day4.realtimebookarrangement;

/*
 2. SmartShelf – Real-Time Book Arrangement (Insertion Sort)
Story: In a digital library kiosk, as users add books to their reading list, the system must keep
the list sorted alphabetically by title. Since books are added one at a time and the list is
mostly sorted, Insertion Sort fits perfectly.
Key Concepts:
● Online/real-time sorting
● Efficient for nearly sorted data
● Stable sorting by title
 */
import java.util.Arrays;
import java.util.Scanner;

public class BookSorting {

	public static void sortBook(String[] arr) {
		for (int i = 1; i < arr.length; i++) {
			String key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void display(String[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] bookName = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the name of book number: " + (i + 1));
			bookName[i] = sc.nextLine();
		}

		while (true) {
			System.out.println("\n1. Sort Array\n2. Display Array\n3. Exit");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				sortBook(bookName);
				System.out.println("Successfully sorted!!");
			} else if (choice == 2) {
				display(bookName);
			}
			else if(choice == 3){
				break;
			}
			else{
				System.out.println("Invalid!!");
			}

		}

	}
}
