package com.bl.collections.List;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
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
        
        // linked hash set for ordered elements
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<al.size();i++) {
        	set.add(al.get(i));	
        }
		ArrayList<Integer> nal = new ArrayList<>();

		for(Integer x : set) {
			nal.add(x);
		}
		System.out.println(nal);
        
	}

}
