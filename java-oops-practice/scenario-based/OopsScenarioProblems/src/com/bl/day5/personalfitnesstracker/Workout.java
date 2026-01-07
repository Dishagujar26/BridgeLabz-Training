package com.bl.day5.personalfitnesstracker;
abstract class Workout implements ITrackable {
    protected String type;
    protected int duration; // minutes
    protected double caloriesBurned;

    // internal logs → not exposed
    protected void logWorkout() {
        System.out.println("Workout logged internally");
    }

    abstract double calculateCalories();

    public void startWorkout() {
        System.out.println(type + " workout started");
    }

    public void stopWorkout() {
        System.out.println(type + " workout stopped");
        logWorkout();
    }
}
