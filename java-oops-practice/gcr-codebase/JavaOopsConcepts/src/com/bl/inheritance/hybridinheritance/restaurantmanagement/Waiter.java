package com.bl.inheritance.hybridinheritance.restaurantmanagement;

public class Waiter extends Person implements Worker {
	Waiter(String name, int id) {
		super(name, id);
	}

	@Override
	public void performDuties() {
		System.out.println("Waiter serves food to customers.");
	}
}
