package com.bl.day5;

/*
 6. RoboWarehouse – Shelf Loading Robot (Insertion Sort)
Story: A robot loads packages onto shelves based on weight. It adds one package at a time
and must maintain an ascending order by weight for balance. Insertion Sort helps since new
items are inserted into the sorted list dynamically.
Key Concepts:
● Insertion into sorted lists
● Low memory footprint
● Ideal for streaming insertions
 */
import java.util.Scanner;

public class RoboWarehouse {
	private int[] weights;

	public RoboWarehouse(int size) {
		weights = new int[size];
	}

	// taking input
	public void inputWeights(Scanner sc) {
		for (int i = 0; i < weights.length; i++) {
			System.out.print("Enter weight of package " + (i + 1) + ": ");
			weights[i] = sc.nextInt();
		}
	}

	public void sortWeights() {
		for (int i = 1; i < weights.length; i++) {
			int key = weights[i];
			int j = i - 1;
			while (j >= 0 && weights[j] > key) {
				weights[j + 1] = weights[j];
				j--;
			}
			weights[j + 1] = key;
		}
	}

	public void display() {
		System.out.println("Sorted package weights:");
		for (int w : weights)
			System.out.print(w + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of packages: ");
		RoboWarehouse rw = new RoboWarehouse(sc.nextInt());
		rw.inputWeights(sc);
		rw.sortWeights();
		rw.display();
	}
}
