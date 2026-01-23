package com.bl.day9.universitydigitalrecordsystem;

import java.util.Scanner;

/*
 Story: University's Digital Record System
The university needs an efficient way to manage student records searchable by roll number.
Scenarios:
● 🔹 Scenario 1: Insertion — As students enroll, insert their roll numbers with personal
details.
● 🔹 Scenario 2: Deletion — If a student leaves, remove their record.
● 🔹 Scenario 3: Search & Display — A professor wants a sorted list of student roll
numbers for attendance.
 */
public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentTree bst = new StudentTree();

		while (true) {
			System.out.println("\n1. Add Student");
			System.out.println("2. Delete Student");
			System.out.println("3. Search Student");
			System.out.println("4. Display All Students");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Roll Number: ");
				int roll = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				bst.root = bst.insert(bst.root, roll, name);
				break;

			case 2:
				System.out.print("Enter Roll Number to Delete: ");
				roll = sc.nextInt();
				bst.root = bst.delete(bst.root, roll);
				break;

			case 3:
				System.out.print("Enter Roll Number to Search: ");
				roll = sc.nextInt();
				StudentNode found = bst.search(bst.root, roll);
				if (found != null)
					System.out.println("Student Found: " + found.rollNumber + " " + found.name);
				else
					System.out.println("Student not found.");
				break;

			case 4:
				System.out.println("All Students (Sorted by Roll Number):");
				bst.inorder(bst.root);
				break;

			case 5:
				System.out.println("Thank You...");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid choice! Try again.");
			}
		}
	}
}
