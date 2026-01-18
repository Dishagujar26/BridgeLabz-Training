package com.bl.day11.bagnballorganizer;

import java.util.ArrayList;
import java.util.List;

public class Bag {
	private String id;
	private String color;
	private int capacity;
	private List<Ball> balls = new ArrayList<>();

	public Bag(String id, String color, int capacity) {
		this.id = id;
		this.color = color;
		this.capacity = capacity;
	}

	public void addBall(Ball ball) {
		if (balls.size() >= capacity) {
			System.out.println("Bag is full. Cannot add ball.");
			return;
		}
		balls.add(ball);
	}

	public void removeBall() {
		if (!balls.isEmpty())
			balls.remove(balls.size() - 1);
	}

	public void displayBalls() {
		System.out.println("Balls in Bag " + id + ":");
		for (Ball b : balls)
			System.out.println(b);
	}

	public int getBallCount() {
		return balls.size();
	}

	public String getId() {
		return id;
	}
}
