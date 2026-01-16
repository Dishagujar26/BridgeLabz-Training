package com.bl.day4.dailysalessummaryreport;

/*
 3. ZipZipMart – Daily Sales Summary Report (Merge Sort)
Story: ZipZipMart compiles thousands of daily sales records from all branches. To generate
reports, the system sorts transactions by date and amount using Merge Sort, which ensures
stability and efficiency with large datasets.
Key Concepts:
● Divide and conquer
● Large-scale sorting
● Preserves order of equal items (stable)
 */

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SalesSorter sorter = new SalesSorter();

		SalesRecord[] records = new SalesRecord[100];
		int count = 0;

		while (true) {
			System.out.println("\n1. Add Sale");
			System.out.println("2. Sort Sales");
			System.out.println("3. Display Sales");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Date (yyyy-mm-dd): ");
				String date = sc.next();
				System.out.print("Amount: ");
				double amount = sc.nextDouble();
				records[count++] = new SalesRecord(date, amount);
				break;

			case 2:
				SalesSorter.mergeSort(records, 0, count - 1);
				System.out.println("Sales sorted successfully.");
				break;

			case 3:
				for (int i = 0; i < count; i++) {
					System.out.println(records[i].date + " | " + records[i].amount);
				}
				break;

			case 4:
				System.out.println("Exiting ZipZipMart...");
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
