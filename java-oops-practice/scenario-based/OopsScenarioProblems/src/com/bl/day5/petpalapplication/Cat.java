package com.bl.day5.petpalapplication;

public class Cat extends Pet{
	Cat(String name) {
        super(name, "Cat");
    }

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
