package com.bl.practiceproblems.restaurantorderprocessing;

public class Chef extends Thread {
	private String dish;
	private int time;

	Chef(String name, String dish, int time) {
		super(name);
		this.dish = dish;
		this.time = time;
	}

	public void run() {
		System.out.println(getName() + " started preparing " + dish);
		int[] steps = { 25, 50, 75, 100 };

		for (int p : steps) {
			try {
				Thread.sleep(time / 4);
			} catch (InterruptedException e) {
			}
			System.out.println(getName() + " preparing " + dish + ": " + p + "%");
		}
	}
}