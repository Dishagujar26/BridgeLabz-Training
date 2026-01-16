package com.bl.day4.studentrankgenerator;
/*
 5. ExamCell – Student Rank Generator (Merge Sort)
Story: An online exam system collects scores from multiple test centers. To publish a
state-level rank list, student scores are merged and sorted using Merge Sort, ensuring
performance and accuracy.
Key Concepts:
● Merging pre-sorted center-wise scores
● Sorting across centers
● High efficiency for big data
 */
import java.util.Scanner;

public class ExamCellApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[200];
		int count = 0;

		while (true) {
			System.out.println("\n1. Add Student Score");
			System.out.println("2. Generate Rank List");
			System.out.println("3. Display Rank List");
			System.out.println("4. Exit");
			System.out.print("Choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Student ID: ");
				int id = sc.nextInt();
				System.out.print("Score: ");
				int score = sc.nextInt();
				students[count++] = new Student(id, score);
				break;

			case 2:
				RankSorter.mergeSort(students, 0, count - 1);
				System.out.println("Rank list generated.");
				break;

			case 3:
				for (int i = 0; i < count; i++) {
					System.out
							.println("Rank " + (i + 1) + " -> ID: " + students[i].id + ", Score: " + students[i].score);
				}
				break;

			case 4:
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
