package com.bl.functionalinterfaces.runnable;

public class RunnableDemo {
	public static void main(String[] args) {

		// 1. Background task
		Runnable task1 = () -> System.out.println("Background task running...");
		new Thread(task1).start();

		// 2. File cleanup task
		Runnable cleanup = () -> System.out.println("Cleaning temp files...");
		new Thread(cleanup).start();

		// 3. Print message in separate thread
		Runnable msgTask = () -> System.out.println("Hello from thread!");
		new Thread(msgTask).start();
	}
}
