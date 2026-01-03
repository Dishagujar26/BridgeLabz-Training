package com.bl.day2.smarthomeautomationsystem;

public class Light extends Appliance{
	Light() {
        super(40);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Light ON | Power: " + getPower());
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Light OFF");
    }
}
