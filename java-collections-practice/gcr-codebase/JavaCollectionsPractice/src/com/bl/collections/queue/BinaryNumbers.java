package com.bl.collections.queue;

import java.util.*;

public class BinaryNumbers {
	public static void main(String[] args) {
		int N = 5;

		Queue<String> q = new LinkedList<>();
		q.add("1");

		List<String> result = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String curr = q.poll();
			result.add(curr);

			q.add(curr + "0");
			q.add(curr + "1");
		}

		System.out.println(result);
	}
}
