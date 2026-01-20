package com.bl.exceptions;

public class ExceptionPropagationInMethods {

	static void method1() {
		int result = 10 / 0; 
	}

	static void method2() {
		method1(); // propagates exception
	}

	public static void main(String[] args) {
		try {
			method2();
		} catch (ArithmeticException e) {
			System.out.println("Handled exception in main");
		}
	}
}
