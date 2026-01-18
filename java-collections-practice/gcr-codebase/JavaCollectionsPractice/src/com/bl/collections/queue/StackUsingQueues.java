package com.bl.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

	
	// making queue to behave like stack that remove the element that has been newly added LIFO
	private Queue<Integer> q1 = new LinkedList<>();
	private Queue<Integer> q2 = new LinkedList<>();

	// Push operation
	public void push(int x) {
		q2.add(x);

		while (!q1.isEmpty()) {
			q2.add(q1.remove());
		}

		// swap q1 and q2
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}

	// Pop operation
	public int pop() {
		return q1.remove();
	}

	public static void main(String[] args) {
		StackUsingQueues stack = new StackUsingQueues();

		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack.pop()); // Output: 3
	}
}
