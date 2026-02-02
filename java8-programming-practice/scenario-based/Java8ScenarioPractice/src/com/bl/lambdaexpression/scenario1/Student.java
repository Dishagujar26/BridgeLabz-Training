package com.bl.lambdaexpression.scenario1;

public class Student {
	String name;
	int marks;
	int rank;
	int age;

	Student(String name, int marks, int rank, int age) {
		this.name = name;
		this.marks = marks;
		this.rank = rank;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "-" + marks + "-" + rank + "-" + age;
	}
}
