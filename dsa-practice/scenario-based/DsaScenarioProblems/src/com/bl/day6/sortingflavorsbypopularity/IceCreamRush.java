package com.bl.day6.sortingflavorsbypopularity;

/*
  1. IceCreamRush – Sorting Flavors by Popularity (Bubble Sort)
Story: At “IceCreamRush,” a small local vendor sells 8 different ice cream flavors. At the end of
each week, the shopkeeper wants to sort these flavors based on how many times each was
sold. Since the list is short and he updates it manually, he prefers a simple sorting method —
Bubble Sort — where he repeatedly compares adjacent sales figures and swaps them if
Needed.

Concepts Involved:
● Bubble Sort
● Small data size
● Repeated adjacent comparisons
 */
import java.util.Scanner;

public class IceCreamRush {

	public static void bubbleSort(IceCream[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j].getSales() > arr[j + 1].getSales()) {
					IceCream temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of flavors: ");
		int n = sc.nextInt();
		sc.nextLine();

		IceCream[] flavors = new IceCream[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter flavor name: ");
			String name = sc.nextLine();
			System.out.print("Enter sales count: ");
			int sales = sc.nextInt();
			sc.nextLine();
			flavors[i] = new IceCream(name, sales);
		}

		bubbleSort(flavors);

		System.out.println("\nFlavors sorted by popularity:");
		for (IceCream f : flavors) {
			System.out.println(f);
		}
	}
}
