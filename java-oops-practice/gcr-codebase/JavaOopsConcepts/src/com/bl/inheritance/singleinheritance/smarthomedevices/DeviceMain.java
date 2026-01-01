package com.bl.inheritance.singleinheritance.smarthomedevices;

public class DeviceMain {
   public static void main(String []args) {
	   Device device = new Thermostat(01,"Available in good condition","Keep the tempratude moderate" );
	   device.displayStatus();
   }
}
