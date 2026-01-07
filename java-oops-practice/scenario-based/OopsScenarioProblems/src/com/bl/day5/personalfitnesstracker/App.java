package com.bl.day5.personalfitnesstracker;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Set daily target: ");
		int dailyTarget = sc.nextInt();

		Workout w1 = new CardioWorkout(dailyTarget);
		w1.startWorkout();
		w1.stopWorkout();

		double progress = dailyTarget - w1.caloriesBurned;

		System.out.println("Calories Burned: " + w1.caloriesBurned);
		System.out.println("Remaining Calories to Target: " + progress);
	}
}
