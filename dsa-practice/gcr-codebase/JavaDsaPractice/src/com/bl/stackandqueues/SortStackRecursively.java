package com.bl.stackandqueues;

import java.util.Scanner;
import java.util.Stack;

public class SortStackRecursively {

	// Sort stack
	public static void sortStack(Stack<Integer> stack) {
		if (stack.isEmpty())
			return;

		int top = stack.pop();
		sortStack(stack);
		insertSorted(stack, top);
	}

	// Insert element in sorted order
	private static void insertSorted(Stack<Integer> stack, int value) {
		if (stack.isEmpty() || stack.peek() <= value) {
			stack.push(value);
			return;
		}

		int temp = stack.pop();
		insertSorted(stack, value);
		stack.push(temp);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		System.out.println("Enter stack elements:");
		for (int i = 0; i < n; i++) {
			stack.push(sc.nextInt());
		}

		sortStack(stack);
		System.out.println("Sorted Stack: " + stack);

		sc.close();
	}

}
