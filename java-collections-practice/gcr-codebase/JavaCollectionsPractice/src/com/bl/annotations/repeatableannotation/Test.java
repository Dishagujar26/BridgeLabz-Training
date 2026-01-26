package com.bl.annotations.repeatableannotation;

import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws Exception {
		Method m = App.class.getDeclaredMethod("run");
		for (BugReport b : m.getAnnotationsByType(BugReport.class)) {
			System.out.println(b.description());
		}
	}
}