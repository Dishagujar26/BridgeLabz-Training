package com.bl.streamapi.transformingnames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomerMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> cutomerNames = new ArrayList<>();
		
		while (true) {
			System.out.println("1. Register Member\n2. Members Whose Membership Expires \n3. Exit");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				System.out.println("Name:");
				String name = sc.nextLine();
				

				cutomerNames.add(name);
				System.out.println("Name added succesfully!");

			} else if (choice == 2) {
				List<String> modifiedNames = cutomerNames.stream().map(String::toUpperCase).sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList());

				modifiedNames.forEach(m -> System.out.println(m));

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
