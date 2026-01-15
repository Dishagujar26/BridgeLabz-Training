package com.bl.day3.onlineexamreview;

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

public class ExamApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExamSystem exam = new ExamSystem();

		while (true) {
			System.out.println("\n1.Visit Question  2.Answer  3.Submit");
			int ch = sc.nextInt();

			if (ch == 1) {
				System.out.print("Question number: ");
				exam.visitQuestion(sc.nextInt());
			} else if (ch == 2) {
				System.out.print("Question number: ");
				int q = sc.nextInt();
				System.out.print("Answer: ");
				String ans = sc.next();
				exam.answerQuestion(q, ans);
			} else {
				exam.submit();
				break;
			}
		}
	}
}
