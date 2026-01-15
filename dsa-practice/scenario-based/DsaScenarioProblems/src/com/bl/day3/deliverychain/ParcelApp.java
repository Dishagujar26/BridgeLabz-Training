package com.bl.day3.deliverychain;

/*
 10. ParcelTracker – Delivery Chain Management (Singly Linked List)
Story: A courier company tracks parcels through stages like Packed → Shipped → In Transit →
Delivered. Each stage is a node in a Singly Linked List.
Requirements:
● Forward tracking through stages.
● Add custom intermediate checkpoints.
● Handle lost/missing parcels (null pointers).

 */

import java.util.Scanner;

public class ParcelApp {
	public static void main(String[] args) {
		ParcelTracker tracker = new ParcelTracker();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n1.View  2.Add Checkpoint  3.Exit");
			int ch = sc.nextInt();
			sc.nextLine();

			if (ch == 1) {
				tracker.display();
			} else if (ch == 2) {
				System.out.print("After which stage? ");
				String after = sc.nextLine();
				System.out.print("New stage: ");
				String stage = sc.nextLine();
				tracker.addCheckpoint(after, stage);
			} else
				break;
		}
	}
}
