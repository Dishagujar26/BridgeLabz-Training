package com.bl.day2.vehiclerentalapplication;

public class Customer {
	private int customerId;
    private String name;

    Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
