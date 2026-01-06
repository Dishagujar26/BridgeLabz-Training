package com.bl.day4.collegeinformationsystem;

import java.util.Scanner;

public class CampusConnect {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("What's the ID");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Faculty Name");
		String name = sc.nextLine();
		
		System.out.println("Enter the Email");
		String email = sc.next();
		
		System.out.println("Enter the Faculty Department");
		String dept = sc.next();
		
		Faculty f1 = new Faculty(id, name, email, dept);
        
		System.out.println("Whta's the student ID");
		int roll = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the student Name");
		String stuname = sc.nextLine();
		
		System.out.println("Enter the Email");
		String stuemail = sc.next();
		
		Student s1 = new Student(roll, stuname, stuemail);
		s1.addGrade(8);
		s1.addGrade(9);

		Course c1 = new Course("Data Structures", f1);

		s1.enrollCourse(c1);

		s1.printDetails(); 
		f1.printDetails();

		c1.showCourseDetails();
	}
}
