package com.bl.inheritance.assistedproblems.animalhierarchy;

public class AnimalMain {
	
	public static void main(String []args) {
		
		// parent reference child's object
		Animal animal = new Dog("Golden Retriever",9);
		animal.makeSound();
		
		animal = new Bird("Pigeon",3);
		animal.makeSound();
		
		animal = new Cat("Ragdoll",2);
		animal.makeSound();
		
	}

}
