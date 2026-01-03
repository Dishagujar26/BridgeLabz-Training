package com.bl.day2.smarthomeautomationsystem;

public abstract class Appliance implements Controllable{
	private boolean isOn;
    private int power; // watts

    Appliance(int power) {
        this.power = power;
    }

    protected int getPower() {
        return power;
    }

    protected void setOn(boolean status) {
        isOn = status;
    }

    public boolean isOn() {
        return isOn;
    }
}
