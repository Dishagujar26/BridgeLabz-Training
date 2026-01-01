package com.bl.inheritance.assistedproblems.animalhierarchy;

public class Animal {
	
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void makeSound() {
		System.out.println("Animal is making sound!");
	}

}
