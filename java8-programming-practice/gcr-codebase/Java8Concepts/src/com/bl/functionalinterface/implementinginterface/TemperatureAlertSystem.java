package com.bl.functionalinterface.implementinginterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlertSystem {
	public static void main(String[] args) {
		double threshold = 35.89;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temprature:");
		double temp = sc.nextDouble();
		
		Predicate<Double> p = (a) -> a >  threshold;
		if(p.test(temp)) {
			System.out.println("Alert...");
		}
		else {
			System.out.println("No Alert...");
		}
	
	}

}
