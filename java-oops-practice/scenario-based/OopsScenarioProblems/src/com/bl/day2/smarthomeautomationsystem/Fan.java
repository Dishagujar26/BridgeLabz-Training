package com.bl.day2.smarthomeautomationsystem;

public class Fan extends Appliance {
	Fan(int power) { // user-defined power
		super(power);
	}

	@Override
	public void turnOn() {
		setOn(true);
		System.out.println("Fan ON | Power: " + getPower());
	}

	@Override
	public void turnOff() {
		setOn(false);
		System.out.println("Fan OFF");
	}
}
