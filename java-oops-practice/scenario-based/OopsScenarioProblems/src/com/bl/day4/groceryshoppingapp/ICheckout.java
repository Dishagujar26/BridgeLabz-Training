package com.bl.day4.groceryshoppingapp;

public interface ICheckout {

	void generateBill();

	double applyDiscount(double total);
}
