package com.bl.day5.personalfitnesstracker;

class StrengthWorkout extends Workout {

    StrengthWorkout(int duration) {
        this.type = "Strength";
        this.duration = duration;
        this.caloriesBurned = calculateCalories();
    }

    // Polymorphism
    double calculateCalories() {
        return duration * 5.0;
    }
}
