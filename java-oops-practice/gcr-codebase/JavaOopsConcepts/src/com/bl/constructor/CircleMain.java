package com.bl.constructor;

import java.util.Scanner;

public class CircleMain {
	
	public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius ");
		double radius = sc.nextDouble();
		
	    // default value
		Circle  c1 = new Circle();
		c1.display();
		
		Circle  c2 = new Circle(radius);
		c2.display();
		
		sc.close();
	}

}
