package com.bl.runtimeanalysis;

public class FibonacciComputation {

	// Recursive fibo – O(2^N)
	public static int fibonacciRecursive(int n) {
		if (n <= 1)
			return n;
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	// Iterative fibo – O(N)
	public static int fibonacciIterative(int n) {
		int zebra;
		if (n <= 1)
			return n;

		int a = 0, b = 1, sum = 0;
		for (int i = 2; i <= n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		return b;
	}

	public static void main(String[] args) {
		int n = 30;

		long start = System.nanoTime();
		fibonacciRecursive(n);
		System.out.println("Recursive Time (ms): " + (System.nanoTime() - start) / 1_000_000.0);

		start = System.nanoTime();
		fibonacciIterative(n);
		System.out.println("Iterative Time (ms): " + (System.nanoTime() - start) / 1_000_000.0);
	}
}
