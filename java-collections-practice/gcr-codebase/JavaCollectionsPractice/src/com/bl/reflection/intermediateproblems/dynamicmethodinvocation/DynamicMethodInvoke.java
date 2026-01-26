package com.bl.reflection.intermediateproblems.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvoke {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter method name: ");
		String methodName = sc.next(); // add / subtract / multiply

		Class<?> cls = MathOperations.class;
		Object obj = cls.getDeclaredConstructor().newInstance();

		Method method = cls.getMethod(methodName, int.class, int.class);
		Object result = method.invoke(obj, 10, 5);

		System.out.println("Result: " + result);
	}
}