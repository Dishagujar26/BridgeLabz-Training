package com.bl.day5.petpalapplication;

public class Dog extends Pet {
	Dog(String name) {
		super(name, "Dog");
	}

	@Override
	void makeSound() {
		System.out.println("Woof Woof!");
	}
}
