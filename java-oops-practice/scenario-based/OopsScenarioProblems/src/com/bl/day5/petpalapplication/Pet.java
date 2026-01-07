package com.bl.day5.petpalapplication;

import java.util.Random;

public abstract class Pet implements IInteractable{
	protected String name;
    protected String type;
    protected int age;

    // encapsulated internal state
    private int hunger; // 0 (full) → 100 (very hungry)
    private int energy; // 0 (tired) → 100 (active)
    private int mood;   // 0 (sad) → 100 (happy)

    // random default constructor
    Pet(String name, String type) {
        this(name, type, new Random().nextInt(10) + 1);
    }

    // user-specified constructor
    Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random r = new Random();
        this.hunger = r.nextInt(40) + 30;
        this.energy = r.nextInt(40) + 30;
        this.mood = r.nextInt(40) + 30;
    }

    // controlled state updates
    protected void changeHunger(int value) {
        hunger = Math.max(0, Math.min(100, hunger + value));
    }

    protected void changeEnergy(int value) {
        energy = Math.max(0, Math.min(100, energy + value));
    }

    protected void changeMood(int value) {
        mood = Math.max(0, Math.min(100, mood + value));
    }

    public void feed() {
        changeHunger(-20);
        changeMood(+10);
        System.out.println(name + " is fed");
    }

    public void play() {
        changeEnergy(-20);
        changeHunger(+10);
        changeMood(+20);
        System.out.println(name + " is playing");
    }

    public void sleep() {
        changeEnergy(+30);
        changeMood(+5);
        System.out.println(name + " is sleeping");
    }

    // internal info only via method
    public void showStatus() {
        System.out.println("Energy: " + energy + ", Hunger: " + hunger + ", Mood: " + mood);
    }

    // polymorphic behavior
    abstract void makeSound();
}
