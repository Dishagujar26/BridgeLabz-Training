package com.bl.constructor;

public class Person {
	
	String name;
	int age;
	String gender;
	
	// parameterized constructor 
	Person(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// copy constructor 
	Person(Person person){
		this.name = person.name;
		this.age = person.age;
		this.gender = person.gender;
	}
	
	// Display Person Details
    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }


}
