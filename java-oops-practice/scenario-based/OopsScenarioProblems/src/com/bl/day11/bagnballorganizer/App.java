package com.bl.day11.bagnballorganizer;

/*
 You’re building a toy storage system for TinyTown Play School, which wants to keep track of
bags and the balls inside them.
Each Bag has:
● A unique ID, color, and capacity (number of balls it can hold)
Each Ball has:
● A unique ID, color, and size (small/medium/large)

 Problem Statement:
Develop a Java system to:
● Add balls to a bag (up to capacity)
● Remove a ball from a bag
● Display all balls in a bag
● Display all bags and their ball count
● Prevent adding a ball if the bag is full
 */
import java.util.Scanner;

public class App {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        Bag bag = new Bag("B1", "Red", 3);

	        bag.addBall(new Ball("BL1", "Blue", "Small"));
	        bag.addBall(new Ball("BL2", "Green", "Medium"));
	        bag.addBall(new Ball("BL3", "Yellow", "Large"));
	        bag.addBall(new Ball("BL4", "Pink", "Small")); // blocked

	        bag.displayBalls();
	        bag.removeBall();

	        System.out.println("\nAfter removing one ball:");
	        bag.displayBalls();

	        System.out.println("\nTotal balls in bag: " + bag.getBallCount());
	    }

}
