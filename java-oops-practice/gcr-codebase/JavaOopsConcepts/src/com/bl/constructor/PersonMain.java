package com.bl.constructor;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name ");
		String name = sc.nextLine();

		System.out.println("Enter Age ");
		int age = sc.nextInt();

		System.out.println("Enter Gender ");
		String gender = sc.nextLine();

		Person person1 = new Person(name, age, gender);
		person1.displayPersonDetails();

		System.out.println("---------------------------------------");

		Person person2 = new Person(person1);
		person2.displayPersonDetails();

		sc.close();
	}

}
