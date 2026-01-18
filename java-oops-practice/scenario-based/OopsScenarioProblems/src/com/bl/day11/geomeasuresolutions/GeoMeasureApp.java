package com.bl.day11.geomeasuresolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 You're working at GeoMeasure Solutions, a company that builds custom software for civil
engineers and architects. One of their core requirements is to compare line segments on
blueprints to determine if they are of equal length, or which one is longer.
 Problem Statement:
Build a Java application that:
● Allows a user to input the coordinates (x1, y1, x2, y2) of two lines.
● Uses a method to calculate the length of each line.
● Compares the two lengths and prints whether they are equal, or which is longer.
● Uses encapsulation to hide the internal data of each line.
● Uses constructors to initialize line objects.
Bonus: Support multiple line comparisons and store them in a list.
 */
public class GeoMeasureApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Line> lines = new ArrayList<>();

		System.out.print("Enter number of lines: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter coordinates for Line " + (i + 1));
			lines.add(new Line(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
		}

		for (int i = 0; i < lines.size() - 1; i++) {
			double len1 = lines.get(i).getLength();
			double len2 = lines.get(i + 1).getLength();

			System.out.println("\nComparing Line " + (i + 1) + " and Line " + (i + 2));
			if (len1 == len2)
				System.out.println("Both lines are equal");
			else if (len1 > len2)
				System.out.println("Line " + (i + 1) + " is longer");
			else
				System.out.println("Line " + (i + 2) + " is longer");
		}
	}
}
