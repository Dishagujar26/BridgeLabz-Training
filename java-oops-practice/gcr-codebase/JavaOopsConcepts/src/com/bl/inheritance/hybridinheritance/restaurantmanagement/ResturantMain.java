package com.bl.inheritance.hybridinheritance.restaurantmanagement;

public class ResturantMain {

	public static void main(String[] args) {

		Worker chef = new Chef("Amit", 101);
		Worker waiter = new Waiter("Rahul", 102);

		chef.performDuties();
		waiter.performDuties();
	}
}
