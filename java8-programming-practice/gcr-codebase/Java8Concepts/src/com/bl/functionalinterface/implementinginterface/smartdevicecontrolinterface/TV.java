package com.bl.functionalinterface.implementinginterface.smartdevicecontrolinterface;

public class TV implements Devices{

	@Override
	public void turnOn() {
        System.out.println("TV has turned onn!!");		
	}

	@Override
	public void turnOff() {
        System.out.println("TV has turned Off!!");		
		
	}

}
