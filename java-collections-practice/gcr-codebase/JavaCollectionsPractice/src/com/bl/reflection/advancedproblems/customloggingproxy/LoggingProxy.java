package com.bl.reflection.advancedproblems.customloggingproxy;

import java.lang.reflect.*;

public class LoggingProxy {
	public static void main(String[] args) {

		Greeting target = new GreetingImplementation();

		Greeting proxy = (Greeting) Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), (p, method, args1) -> {
					System.out.println("Method called: " + method.getName());
					return method.invoke(target, args1);
				});

		proxy.sayHello();
	}
}
