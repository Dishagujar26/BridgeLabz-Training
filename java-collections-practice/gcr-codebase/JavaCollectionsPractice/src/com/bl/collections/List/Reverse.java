package com.bl.collections.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Add elements to list press 0 to stop");
		ArrayList<Integer> al = new ArrayList<>();
		int elem;
		while (true) {
			elem = sc.nextInt();
			if (elem != 0) {
				al.add(elem);
			}
			else {
				break;
			}
		}
		System.out.println(al);
		System.out.println(al.reversed());
	}
}
