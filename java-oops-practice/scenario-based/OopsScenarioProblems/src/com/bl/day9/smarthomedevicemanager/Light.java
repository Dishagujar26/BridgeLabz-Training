package com.bl.day9.smarthomedevicemanager;

public class Light extends Device implements IControllable {

	public Light(String id, double energy) {
		super(id, energy);
	}

	@Override
	public void turnOn() {
		setStatus(true);
		System.out.println("Light turned ON");
	}

	@Override
	public void turnOff() {
		setStatus(false);
		System.out.println("Light turned OFF");
	}

	@Override
	public void reset() {
		firmwareLog = "Light firmware reset";
		System.out.println("Light reset completed");
	}
}
