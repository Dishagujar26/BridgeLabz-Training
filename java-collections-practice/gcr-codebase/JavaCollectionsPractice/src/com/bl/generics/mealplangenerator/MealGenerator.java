package com.bl.generics.mealplangenerator;

public class MealGenerator {

	public static <T extends MealPlan> Meal<T> generateMeal(String userName, T mealPlan) {

		// simple validation rule
		if (mealPlan.getCalories() <= 0) {
			throw new IllegalArgumentException("Invalid meal plan");
		}

		return new Meal<>(userName, mealPlan);
	}
}
