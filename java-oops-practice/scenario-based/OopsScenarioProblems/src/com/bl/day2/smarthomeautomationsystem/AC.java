package com.bl.day2.smarthomeautomationsystem;

public class AC extends Appliance {
	AC() {
		super(1500);
	}

	@Override
	public void turnOn() {
		setOn(true);
		System.out.println("AC ON | Cooling Started | Power: " + getPower());
	}

	@Override
	public void turnOff() {
		setOn(false);
		System.out.println("AC OFF");
	}
}
