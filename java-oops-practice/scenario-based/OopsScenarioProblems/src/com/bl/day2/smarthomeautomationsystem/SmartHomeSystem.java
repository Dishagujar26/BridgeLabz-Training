package com.bl.day2.smarthomeautomationsystem;

public class SmartHomeSystem {
	public static void main(String[] args) {

		Appliance light = new Light();
		Appliance fan = new Fan(80);
		Appliance ac = new AC();

		UserController controller = new UserController();

		controller.controlDevice(light, true);
		controller.controlDevice(ac, true);

		controller.compareUsage(ac, fan);
	}
}
