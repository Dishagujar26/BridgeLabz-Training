package com.bl.collections.queue;

import java.util.Scanner;

public class CircularBufferSimulation {

	private int[] buffer;
	private int size;
	private int front = 0;
	private int rear = 0;
	private int count = 0;

	public CircularBufferSimulation(int size) {
		this.size = size;
		buffer = new int[size];
	}

	// Insert element (overwrite if full)
	public void insert(int x) {
		buffer[rear] = x;
		rear = (rear + 1) % size;

		if (count == size) {
			// overwrite oldest
			front = (front + 1) % size;
		} else {
			count++;
		}
	}

	// Display buffer
	public void display() {
		int i = front;
		for (int c = 0; c < count; c++) {
			System.out.print(buffer[i] + " ");
			i = (i + 1) % size;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter buffer size: ");
		int size = sc.nextInt();

		CircularBufferSimulation cb = new CircularBufferSimulation(size);

		System.out.print("How many elements to insert: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter element: ");
			int x = sc.nextInt();
			cb.insert(x);
		}

		System.out.print("Buffer contents: ");
		cb.display();

		sc.close();
	}
}
