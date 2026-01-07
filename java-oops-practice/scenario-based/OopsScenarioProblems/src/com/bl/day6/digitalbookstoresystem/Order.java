package com.bl.day6.digitalbookstoresystem;

public class Order {
	private String status = "CREATED";

	void updateStatus(String newStatus) {
		status = newStatus;
	}

	public String getStatus() {
		return status;
	}
}
