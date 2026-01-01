package com.bl.inheritance.assistedproblems.animalhierarchy;

public class Bird extends Animal{
	
	Bird(String name, int age){
		super(name,age);
	}
 
	@Override
	void makeSound() {
		System.out.println("Bird is chirping!");
	}
}
