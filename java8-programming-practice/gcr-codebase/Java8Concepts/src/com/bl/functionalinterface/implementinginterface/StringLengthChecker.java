package com.bl.functionalinterface.implementinginterface;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringLengthChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int charLimit = 10;
		String str = sc.nextLine();
		
//		The lambda parameter cannot have the same name as a local variable in the enclosing scope.
		Function<String,Integer> f = (a) -> str.toCharArray().length; 
		int currentCount = f.apply(str);
		
		Predicate<Integer> p = (a) -> currentCount > charLimit;
		if(p.test(currentCount)) {
			System.out.println("Limit exceeds...");
		}
		else {
			System.out.println("Does not exceed...");
		}
		

	}

}
