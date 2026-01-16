package com.bl.day4.patientsortingbycriticality;

/*
 1. HospitalQueue – Patient Sorting by Criticality (Bubble Sort)
Story: At Apollo Hospital, patients in the ER are initially listed by arrival time. However, before
assigning beds, the staff wants to sort them by criticality level (1–10). Since the list is usually
small (10–20 patients), Bubble Sort is used to quickly sort patients in-place without using extra
memory.
Key Concepts:
● Bubble Sort for small datasets
● In-place comparison
● Swapping adjacent patient records
 */
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CriticalitySorting cs = new CriticalitySorting();
		while (true) {
			System.out.println("1. Add Students\n2. Sort Patients\n3. Display Patients");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter the patient's name: ");
				String name = sc.next();
				System.out.println("Enter the patient's criticality: ");
				int age = sc.nextInt();

				Patient p = new Patient(name, age);
				cs.addPatient(p);
				System.out.println("Patient added successfully!!");

			} else if (choice == 2) {
				cs.sortPatient();
				System.out.println("Patint's sorted successfully!!!");
			} else if (choice == 3) {
				cs.display();
			}
			else {
				System.out.println("Invalid choce!!");
			}
		}
	}

}
