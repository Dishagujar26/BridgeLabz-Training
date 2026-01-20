package com.bl.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the two number: ");
			int n = sc.nextInt();
			int m = sc.nextInt();
			double div = n/m;
			System.out.println("Diviion of two number is "+ div);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero is not possible!!");
		}
		catch(InputMismatchException  e) {
			System.out.println("Integer input required!!");
		}
	}

}
