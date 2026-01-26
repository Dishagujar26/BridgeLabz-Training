package com.bl.reflection.basicproblems.invokeprivatemethods;

import java.lang.reflect.Method;

public class PrivateMethodDemo {
	public static void main(String[] args) throws Exception {
		
		Class<Calculator> c = Calculator.class;
		Object obj = c.getDeclaredConstructor().newInstance();
		
		// int.class represents the Class object for the primitive type int
		Method multiplyMethod = c.getDeclaredMethod("multiply", int.class, int.class);

		// Make private method accessible
		multiplyMethod.setAccessible(true);

		// Invoke method
		int result = (int) multiplyMethod.invoke(obj, 5, 4); // invoke() returns Object class's object so down-casting
		System.out.println("Multiplication Result: " + result);
	}
}