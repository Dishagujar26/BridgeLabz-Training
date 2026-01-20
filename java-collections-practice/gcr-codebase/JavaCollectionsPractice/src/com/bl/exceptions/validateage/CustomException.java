package com.bl.exceptions.validateage;

import java.util.Scanner;

public class CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age ");
		int age = sc.nextInt();

		try{
			validateAge(age);
		}
		catch(InvalidAgeException e) {
			e.getMessage();
		}
	}
    
	private static boolean validateAge(int age) throws InvalidAgeException {
	    if (age < 18) {
	        throw new InvalidAgeException("Age cannot be less than 18");
	    }
	    return true;
	}


}
	
