package com.bl.day9.smarthomedevicemanager;

public class Thermostat extends Device implements IControllable {

    public Thermostat(String id, double energy) {
        super(id, energy);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat OFF");
    }

    @Override
    public void reset() {
        firmwareLog = "Temperature system recalibrated";
        System.out.println("Thermostat reset done");
    }
}
