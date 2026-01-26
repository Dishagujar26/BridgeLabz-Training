package com.bl.reflection.basicproblems.dynamicallycreateobjects;

/*
 all reflection is done through the Class class 
 (and related classes like Method, Field, Constructor) in the java.lang.reflect package.
*/

public class DynamicObject {
	public static void main(String[] args) throws Exception {
		// Class object representing the Student
		Class<Student> cls = Student.class;

		// Create object dynamically
		Student s = cls.getDeclaredConstructor().newInstance();

		System.out.println(s);
	}
}