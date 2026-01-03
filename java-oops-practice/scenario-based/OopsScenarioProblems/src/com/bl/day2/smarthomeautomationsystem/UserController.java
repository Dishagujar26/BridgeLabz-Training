package com.bl.day2.smarthomeautomationsystem;

public class UserController {
	void controlDevice(Controllable device, boolean status) {
        if (status) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
	void compareUsage(Appliance a1, Appliance a2) {
        if (a1.getPower() > a2.getPower()) {
            System.out.println("First appliance consumes more power");
        } else if (a1.getPower() < a2.getPower()) {
            System.out.println("Second appliance consumes more power");
        } else {
            System.out.println("Both consume equal power");
        }
    }

}
