package com.bl.stackandqueues;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

	public static int[] calculateSpan(int[] prices) {
		// total days 
		int n = prices.length;
		int[] span = new int[n];
		
		// Stack to store indices of days
		Stack<Integer> stack = new Stack<>();

		 // traverse stock prices day by day
		for (int i = 0; i < n; i++) {
			
     		// Remove indices of days with price <= current day's price
			while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
				stack.pop();
			}
			
			// If stack is empty, no greater price on left
	        // Span = all days till now
			if (stack.isEmpty()) {
			    span[i] = i + 1;  
			} else {
			    span[i] = i - stack.peek();  
			}

			
	        // Push current day's index onto stack
			stack.push(i);
		}
		return span;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of days: ");
		int n = sc.nextInt();

		int[] prices = new int[n];
		System.out.println("Enter stock prices:");
		for (int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}

		int[] span = calculateSpan(prices);

		System.out.println("Stock Span:");
		for (int s : span) {
			System.out.print(s + " ");
		}

		sc.close();
	}
}
