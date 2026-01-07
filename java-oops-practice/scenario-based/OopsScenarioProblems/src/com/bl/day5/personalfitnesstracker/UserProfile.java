package com.bl.day5.personalfitnesstracker;
class UserProfile {
    private String name;
    private int age;
    private double weight; // protected via encapsulation
    private String goal;

    // Default goal constructor
    UserProfile(String name, int age, double weight) {
        this(name, age, weight, "Stay Fit");
    }

    // Custom goal constructor
    UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
    }

    // Getter only (no setter → protected health data)
    public double getWeight() {
        return weight;
    }

    public String getGoal() {
        return goal;
    }
}
