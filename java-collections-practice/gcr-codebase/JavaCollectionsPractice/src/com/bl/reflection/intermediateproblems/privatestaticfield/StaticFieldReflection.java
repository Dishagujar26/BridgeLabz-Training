package com.bl.reflection.intermediateproblems.privatestaticfield;

import java.lang.reflect.Field;

/*
 obj (set parameter) The object whose field value you want to change
For instance field → pass the object
For static field → pass null

*/

public class StaticFieldReflection {
	public static void main(String[] args) throws Exception {

		Class<Configuration> cls = Configuration.class;

		Field field = cls.getDeclaredField("API_KEY");
		field.setAccessible(true);

		// void set(Object obj, Object value)
		field.set(null, "NEW_SECRET_KEY"); // static → null object

		System.out.println("Updated API_KEY: " + field.get(null));
	}
}
