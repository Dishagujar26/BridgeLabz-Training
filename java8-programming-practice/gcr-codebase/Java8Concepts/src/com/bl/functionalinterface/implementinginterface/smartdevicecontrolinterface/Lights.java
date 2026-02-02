package com.bl.functionalinterface.implementinginterface.smartdevicecontrolinterface;

public class Lights implements Devices {

	@Override
	public void turnOn() {
        System.out.println("Lights has turned onn!!");		

		
	}

	@Override
	public void turnOff() {
        System.out.println("Lights has turned Off!!");		

		
	}

}
