package com.bl.generics.mealplangenerator;

public class  App{
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                MealGenerator.generateMeal("Amit", new VegetarianMeal());

        Meal<KetoMeal> ketoMeal =
                MealGenerator.generateMeal("Neha", new KetoMeal());

        Meal<VeganMeal> veganMeal =
                MealGenerator.generateMeal("Rahul", new VeganMeal());

        System.out.println(vegMeal.getMealDetails());
        System.out.println(ketoMeal.getMealDetails());
        System.out.println(veganMeal.getMealDetails());
    }
}
