package com.bl.functionalinterface.implementinginterface;

public class BackgroundJobExecution {
	public static void main(String[] args) {

		Runnable task = () -> {
			System.out.println("Background job running...");
		};

		Thread t = new Thread(task);
		t.start(); // runs asynchronously
	}
}
