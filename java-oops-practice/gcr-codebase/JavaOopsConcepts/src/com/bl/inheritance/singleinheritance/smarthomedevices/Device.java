package com.bl.inheritance.singleinheritance.smarthomedevices;

public class Device {

	int deviceId;
	String status;

	public Device(int deviceId, String status) {
		super();
		this.deviceId = deviceId;
		this.status = status;
	}

	void displayStatus() {
		System.out.println("Device ID: " + deviceId);
		System.out.println("Status: " + status);
	}

}
