package com.bl.day5.personalfitnesstracker;

class CardioWorkout extends Workout {

    CardioWorkout(int duration) {
        this.type = "Cardio";
        this.duration = duration;
        this.caloriesBurned = calculateCalories();
    }

    // Polymorphism
    double calculateCalories() {
        return duration * 8.0; // higher burn
    }
}
