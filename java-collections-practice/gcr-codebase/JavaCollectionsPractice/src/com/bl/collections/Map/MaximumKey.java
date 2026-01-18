package com.bl.collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumKey {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		
		System.out.println("Enter the size of the hash map: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter String Key: ");
			String str = sc.next();
			System.out.println("Enter Integer Value: ");
			Integer intee = sc.nextInt();
			map.put(str,intee);
		}
		int maximumValue = Integer.MIN_VALUE;
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			if(e.getValue() > maximumValue) {
				maximumValue = e.getValue();
				sb.setLength(0);
                sb.append(e.getKey());
			}
		}
		System.out.println("String with maximum frequncy is: "+ sb.toString());
	}

}
