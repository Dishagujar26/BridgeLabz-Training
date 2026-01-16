package com.bl.day5;
/*
 7. CinemaHouse – Movie Time Sorting (Bubble Sort)
Story: A small local cinema lists daily movie shows. The screen manager updates showtimes
manually and prefers a simple sorting logic. Since the number of shows is small (~10), Bubble
Sort is used.
Key Concepts:
● Manual data entry, simple logic
● Small dataset
● Minimal code complexity
 */
import java.util.Scanner;

public class CinemaHouse {

	private int[] showTimes;

	public CinemaHouse(int size) {
		showTimes = new int[size];
	}

	public void inputShowTimes(Scanner sc) {
		for (int i = 0; i < showTimes.length; i++) {
			System.out.print("Enter show time " + (i + 1) + ": ");
			showTimes[i] = sc.nextInt();
		}
	}

	public void sortShowTimes() {
		for (int i = 0; i < showTimes.length - 1; i++) {
			for (int j = 0; j < showTimes.length - i - 1; j++) {
				if (showTimes[j] > showTimes[j + 1]) {
					int temp = showTimes[j];
					showTimes[j] = showTimes[j + 1];
					showTimes[j + 1] = temp;
				}
			}
		}
	}

	public void display() {
		System.out.println("Sorted show times:");
		for (int t : showTimes)
			System.out.print(t + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of shows: ");
		CinemaHouse ch = new CinemaHouse(sc.nextInt());
		ch.inputShowTimes(sc);
		ch.sortShowTimes();
		ch.display();
	}
}
