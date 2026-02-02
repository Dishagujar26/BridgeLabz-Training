package com.bl.streamapi.hospitaldoctor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DoctorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Doctor> list = new ArrayList<>();
		while (true) {
			System.out.println("1. Register Doctor\n2. Available Doctors\n3. Exit");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				System.out.println("Doctor Name:");
				String name = sc.nextLine();
				System.out.println("Doctor Availability:");
				boolean avb = sc.nextBoolean();
				System.out.println("Doctor specialty:");
				int spc = sc.nextInt();
				sc.nextLine();

				Doctor m = new Doctor(name, avb, spc );
				list.add(m);
				System.out.println("Movie added succesfully!");

			} else if (choice == 2) {
				List<Doctor> dlist = list.stream().filter(Doctor::isAvailable).sorted(Comparator.comparing(Doctor::getSpecialty)).collect(Collectors.toList());
						
				for (Doctor m : dlist) {
					System.out.println(m.getDoctorName() + " " + m.getSpecialty());
				}

			} else if (choice == 3) {
				System.out.println("Thank you...");
				break;

			} else {
				System.out.println("Invalid Choice...");
				break;
			}

		}

	}
}
