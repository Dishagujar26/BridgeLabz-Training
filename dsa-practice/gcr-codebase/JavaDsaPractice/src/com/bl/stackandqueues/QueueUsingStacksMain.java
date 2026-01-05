package com.bl.stackandqueues;

import java.util.Scanner;

public class QueueUsingStacksMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		QueueUsingStacks queue = new QueueUsingStacks();

		while (true) {
			System.out.println("\n1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Peek");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();

			try {
				switch (choice) {
				case 1:
					System.out.print("Enter value: ");
					queue.enqueue(sc.nextInt());
					break;

				case 2:
					System.out.println("Dequeued: " + queue.dequeue());
					break;

				case 3:
					System.out.println("Front: " + queue.peek());
					break;

				case 4:
					System.out.println("Exiting...");
					sc.close();
					return;

				default:
					System.out.println("Invalid choice");
				}
			}
			//exception when both stacks are empty, meaning there is nothing to dequeue or peek.
			catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
