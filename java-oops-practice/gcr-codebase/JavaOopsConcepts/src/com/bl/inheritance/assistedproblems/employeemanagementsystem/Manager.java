package com.bl.inheritance.assistedproblems.employeemanagementsystem;

public class Manager extends Employee {
	int teamSize;

	public Manager(double salaray, String name, int id, int teamSize) {
		super(salaray, name, id);
		this.teamSize = teamSize;
	}

	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Manager's Team Size " + teamSize);

	}

}
