package com.bl.reflection.basicproblems;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInformation {
	public static void main(String[] args) throws ClassNotFoundException {
		String classname = "java.util.ArrayList";
		Class<?> cls = Class.forName(classname);

		// Methods
		System.out.println("Methods:");
		for (Method m : cls.getDeclaredMethods()) {
			System.out.println(m);
		}

		// Fields
		System.out.println("\nFields:");
		for (Field f : cls.getDeclaredFields()) {
			System.out.println(f);
		}

		// Constructors
		System.out.println("\nConstructors:");
		for (Constructor<?> c : cls.getDeclaredConstructors()) {
			System.out.println(c);
		}

	}

}
