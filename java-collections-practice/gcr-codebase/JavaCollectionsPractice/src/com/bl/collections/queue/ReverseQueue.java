package com.bl.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ReverseQueue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new ArrayDeque<>();
		System.out.println("Enter the size of the queue");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int elem = sc.nextInt();
			q.add(elem);
		}
		System.out.println("Queue: "+ q);
		List<Integer> al = new ArrayList<>();
		for(Integer e : q) {
			al.add(e);
		}
		q.clear();
		Collections.reverse(al);
		for(Integer e : al) {
			q.add(e);
		}
		System.out.println("Reversed Queue: "+ q);
	}

}
