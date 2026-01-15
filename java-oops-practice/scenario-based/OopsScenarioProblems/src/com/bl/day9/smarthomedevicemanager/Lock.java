package com.bl.day9.smarthomedevicemanager;

public class Lock extends Device implements IControllable {

	public Lock(String id, double energy) {
		super(id, energy);
	}

	@Override
	public void turnOn() {
		setStatus(true);
		System.out.println("Door locked");
	}

	@Override
	public void turnOff() {
		setStatus(false);
		System.out.println("Door unlocked");
	}

	@Override
	public void reset() {
		firmwareLog = "Security codes regenerated";
		System.out.println("Lock reset completed");
	}
}
