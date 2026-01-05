package com.bl.stackandqueues;

import java.util.Stack;

public class QueueUsingStacks {
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();

	// add data to stack
	public void enqueue(int x) {
		stack1.push(x);
		System.out.println(x + " enqueued");
	}

	// remove add from stack
	public int dequeue() {
		// copy stack 1 to stack 2
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		if (stack2.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		return stack2.pop();
	}

	public int peek() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.peek();
	}

	// Check empty
	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}
}
