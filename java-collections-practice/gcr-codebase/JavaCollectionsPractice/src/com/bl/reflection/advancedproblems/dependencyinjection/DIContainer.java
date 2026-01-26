package com.bl.reflection.advancedproblems.dependencyinjection;

import java.lang.reflect.Field;

class DIContainer {
	static void inject(Object obj) throws Exception {

		for (Field f : obj.getClass().getDeclaredFields()) {
			if (f.isAnnotationPresent(Inject.class)) {
				f.setAccessible(true);
				f.set(obj, f.getType().getDeclaredConstructor().newInstance());
			}
		}
	}
}