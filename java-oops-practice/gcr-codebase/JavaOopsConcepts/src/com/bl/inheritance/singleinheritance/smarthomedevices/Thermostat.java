package com.bl.inheritance.singleinheritance.smarthomedevices;

public class Thermostat extends Device{
	
	String temperatureSetting;

	public Thermostat(int deviceId, String status, String temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}
	
	@Override
	void displayStatus() {
		super.displayStatus();
		System.out.println("Temprature Setting: " + temperatureSetting);
	}
}
