package com.bl.stringbuffer;

import java.util.Scanner;

public class ConcatenateStrings {

	public static String concateString(String []str) {
		StringBuffer sb = new StringBuffer();
		for(String s : str) {
			sb.append(s);
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the string array");
        int n = sc.nextInt();
        String []str = new String[n];
		
	    for(int i=0;i<n;i++) {
	    	str[i] = sc.next();
	    }
	    System.out.println(concateString(str));
	}
}
