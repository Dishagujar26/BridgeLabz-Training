package com.bl.streamapi.filterdates;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilteringExpiring {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<GymMember> list = new ArrayList<>();
		LocalDate today = LocalDate.now();
		LocalDate threshold = today.plusDays(30);
		while (true) {
			System.out.println("1. Register Member\n2. Members Whose Membership Expires \n3. Exit");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				System.out.println("Name:");
				String name = sc.nextLine();
				System.out.println("Enter membership expiry date (yyyy-MM-dd):");
				String sdate = sc.nextLine();
				LocalDate date = LocalDate.parse(sdate);

				GymMember m = new GymMember(name, date);
				list.add(m);
				System.out.println("Member registered succesfully!");

			} else if (choice == 2) {
				List<GymMember> expiringSoon = list.stream()
						.filter(m -> !m.getDate().isBefore(today) && !m.getDate().isAfter(threshold))
						.collect(Collectors.toList());

				expiringSoon.forEach(m -> System.out.println(m.getName() + " " + m.getDate()));

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
