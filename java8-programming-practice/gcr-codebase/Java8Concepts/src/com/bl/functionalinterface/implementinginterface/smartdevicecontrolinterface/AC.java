package com.bl.functionalinterface.implementinginterface.smartdevicecontrolinterface;

public class AC implements Devices{

	@Override
	public void turnOn() {
		 System.out.println("AC has turned onn!!");	
		
	}

	@Override
	public void turnOff() {
		 System.out.println("AC has turned Off!!");	
		
	}

}
