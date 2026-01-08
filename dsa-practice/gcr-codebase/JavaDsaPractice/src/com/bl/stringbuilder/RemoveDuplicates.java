package com.bl.stringbuilder;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String str = sc.next();

		StringBuilder sb = new StringBuilder();
		
	    Set<Character> set = new LinkedHashSet<>();
	    for(int i=0;i<str.length();i++) {
	    	set.add(str.charAt(i));
	    }
	    for (char x : set) {
	        sb.append(x);
	    }
	    System.out.println("Removed duplicates: "+ sb.toString());
	}

}
