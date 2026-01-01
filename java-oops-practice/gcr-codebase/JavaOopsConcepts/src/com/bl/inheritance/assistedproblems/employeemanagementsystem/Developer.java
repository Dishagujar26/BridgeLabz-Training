package com.bl.inheritance.assistedproblems.employeemanagementsystem;

public class Developer extends Employee{

	String programmingLanguage;

	public Developer(double salaray, String name, int id, String programmingLanguage) {
		super(salaray, name, id);
		this.programmingLanguage = programmingLanguage;
	}
	
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Programming Language " + programmingLanguage);

	}
	
}
