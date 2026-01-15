package com.bl.day9.smarthomedevicemanager;

public class Device {
	protected String deviceId;
	private boolean status; // Encapsulated
	protected double energyUsage; // in units
	protected String firmwareLog; // protected for subclasses

	public Device(String deviceId, double energyUsage) {
		this.deviceId = deviceId;
		this.energyUsage = energyUsage;
		this.status = false;
		this.firmwareLog = "Initialized";
	}

	public boolean getStatus() {
		return status;
	}

	protected void setStatus(boolean status) { // Not accessible from outside
		this.status = status;
	}

	public double getEnergyUsage() {
		return energyUsage;
	}
}
