package com.bl.collections.List;

import java.util.LinkedList;
import java.util.Scanner;

public class NthElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedList<Integer> ll = new LinkedList<>();

		System.out.println("Enter number of nodes");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter data");
			ll.add(sc.nextInt());
		}

		System.out.println(ll);
		System.out.println("Enter the idx of element you want to display");
		int idx = sc.nextInt();
		
        try{
        	System.out.println(ll.get(idx));
        }
        catch(IndexOutOfBoundsException e){
        	e.toString();
        }
        sc.close();
	}

}
