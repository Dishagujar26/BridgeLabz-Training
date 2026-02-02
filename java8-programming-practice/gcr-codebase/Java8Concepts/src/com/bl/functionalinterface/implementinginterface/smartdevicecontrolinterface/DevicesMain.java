package com.bl.functionalinterface.implementinginterface.smartdevicecontrolinterface;

public class DevicesMain {
	public static void main(String[] args) {
		Devices d = new TV();
		d.turnOff();
		d.turnOn();
		
		d= new AC();
		d.turnOff();
		d.turnOn();
		
		d = new Lights();
		d.turnOff();
		d.turnOn();
		
	}

}
