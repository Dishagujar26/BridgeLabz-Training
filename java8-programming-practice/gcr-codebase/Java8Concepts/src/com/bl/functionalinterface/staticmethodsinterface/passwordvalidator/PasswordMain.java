package com.bl.functionalinterface.staticmethodsinterface.passwordvalidator;

import java.util.Scanner;

public class PasswordMain implements PasswordStrengthValidator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pass = sc.nextLine();
		
		if(PasswordStrengthValidator.SecurityUtils(pass)){
			 System.out.println("Strong");
		}
		else {
			System.out.println("Weak");
		}
		
	}

}
