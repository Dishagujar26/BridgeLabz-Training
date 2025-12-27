package com.bl.constructor;

public class Circle {
	// Attributes 
    double radius;
	
	// Parameterized Constructors
	public Circle(double radius){
		this.radius = radius;
	}
	
	public Circle() {
	}
	public void display() {
		System.out.println("Radius is "+ radius);
	}
}
