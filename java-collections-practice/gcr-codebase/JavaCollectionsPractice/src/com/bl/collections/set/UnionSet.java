package com.bl.collections.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		System.out.println("Enter size of set1");
		int n1 = sc.nextInt();

		System.out.println("Enter elements of set1");
		for (int i = 0; i < n1; i++) {
		    set1.add(sc.nextInt());
		}

		System.out.println("Enter size of set2");
		int n2 = sc.nextInt();

		System.out.println("Enter elements of set2");
		for (int i = 0; i < n2; i++) {
		    set2.add(sc.nextInt());
		}
        // union
		Set<Integer> union = new HashSet<>();
		for(Integer e : set1) {
			union.add(e);
		}
		for(Integer e : set2) {
			union.add(e);
		}
	    
        System.out.println("Union " + union);
        
        // we can use contains method to find interaction
        
        // interaction
		Set<Integer> interaction = new HashSet<>();
        for(Integer e : set2) {
        	if(set1.contains(e)) {
        		interaction.add(e);
        	}
        }
        System.out.println("Interaction "+ interaction);
		sc.close();

	}

}
