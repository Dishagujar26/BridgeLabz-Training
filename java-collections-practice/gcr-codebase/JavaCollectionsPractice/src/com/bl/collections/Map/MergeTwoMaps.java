package com.bl.collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MergeTwoMaps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();

		
		System.out.println("Enter the size of the hash map 1: ");
		int n1 = sc.nextInt();

		for (int i = 0; i < n1; i++) {
			System.out.println("Enter String Key: ");
			String str = sc.next();
			System.out.println("Enter Integer Value: ");
			Integer intee = sc.nextInt();
			map1.put(str,intee);
		}
		
		System.out.println("Enter the size of the hash map 2: ");
		int n2 = sc.nextInt();

		for (int i = 0; i < n2; i++) {
			System.out.println("Enter String Key: ");
			String str = sc.next();
			System.out.println("Enter Integer Value: ");
			Integer intee = sc.nextInt();
			map2.put(str,intee);
		}
		// copy map1 to map 3 as it is 
		HashMap<String, Integer> map3 = new HashMap<>();
        for(Map.Entry<String, Integer> e : map1.entrySet()) {
        	map3.put(e.getKey(), e.getValue());
        }
        
        // now copy map2 to map 3 for already existing key increment value
        for(Map.Entry<String, Integer> e : map2.entrySet()) {
        	map3.put(e.getKey(), map3.getOrDefault(e.getKey(), 0) + e.getValue());
        }
        
		System.out.println("Map 1 ");

        // print map 1
        map1.forEach((k, v) -> System.out.println(k + " -> " + v));
        
        System.out.println("Map 2");

       // print map 2
        map2.forEach((k, v) -> System.out.println(k + " -> " + v));
        
        System.out.println("Map 3");

       // print map 3
        map3.forEach((k, v) -> System.out.println(k + " -> " + v));

	}

}
