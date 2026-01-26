package com.bl.annotations.override;

public class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}