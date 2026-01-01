package com.bl.inheritance.hierarchicalinheritance.schoolsystem;

public class Student extends Person {
	int grade;

	Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}

	void displayRole() {
		System.out.println("Role: Student");
	}

}
