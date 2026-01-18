package com.bl.collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Add elements to list press 0 to stop");
		ArrayList<Integer> al = new ArrayList<>();
		int elem;
		while (true) {
			elem = sc.nextInt();
			if (elem == 0) {
				break;
			}
			al.add(elem);
		}
        System.out.println(al);
		// left rotate - step1 reverse the first k elements step2 reverse the remaining
		// elements n-k ste3 then reverse the entire array
		// right rotate - step1 reverse the entire array step2 reverse the first k
		// elements ste3 then reverse the remaining n-k elements

		// reverse first k elements
		reverse(al, 0, 1);  // last index = k - 1” whenever you reverse a segment of size k.

		// reverse n-k elements
		reverse(al, 2, al.size() - 1);
		
		// reverse n-k elements
		reverse(al, 0, al.size() - 1);
		
        System.out.println(al);
         
        sc.close();

	}

	// reverse logic - 2 pointer
	public static void reverse(List<Integer> al, int low, int high) {
		while (low < high) {
			//swap
			int temp = al.get(low);
			al.set(low, al.get(high));
			al.set(high, temp);
			
			high--;
			low++;
		}
	}
}
