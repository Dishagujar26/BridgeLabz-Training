package com.bl.day9.smarthomedevicemanager;

public class Camera extends Device implements IControllable {

	public Camera(String id, double energy) {
		super(id, energy);
	}

	@Override
	public void turnOn() {
		setStatus(true);
		System.out.println("Camera activated");
	}

	@Override
	public void turnOff() {
		setStatus(false);
		System.out.println("Camera deactivated");
	}

	@Override
	public void reset() {
		firmwareLog = "Camera security rebooted";
		System.out.println("Camera reset completed");
	}
}
