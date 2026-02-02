package com.bl.lambdaexpression.scenario2;

public class Employee {
	String name;
	double salary;
	int exp;

	Employee(String name, double salary, int exp) {
		this.name = name;
		this.salary = salary;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return name + "-" + salary + "-" + exp;
	}
}