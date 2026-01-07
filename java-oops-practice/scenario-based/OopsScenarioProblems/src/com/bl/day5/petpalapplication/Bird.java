package com.bl.day5.petpalapplication;

public class Bird extends Pet {
	Bird(String name) {
		super(name, "Bird");
	}

	@Override
	void makeSound() {
		System.out.println("Chirp Chirp!");
	}
}
