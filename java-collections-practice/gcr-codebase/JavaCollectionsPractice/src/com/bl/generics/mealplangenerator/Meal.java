package com.bl.generics.mealplangenerator;

public class Meal<T extends MealPlan> {

	private String userName;
	private T mealPlan;

	public Meal(String userName, T mealPlan) {
		this.userName = userName;
		this.mealPlan = mealPlan;
	}

	public String getMealDetails() {
		return userName + " | " + mealPlan.getMealType() + " | Calories: " + mealPlan.getCalories();
	}
}
