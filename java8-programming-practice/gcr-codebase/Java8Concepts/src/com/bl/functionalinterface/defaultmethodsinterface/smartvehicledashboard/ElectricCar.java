package com.bl.functionalinterface.defaultmethodsinterface.smartvehicledashboard;
public class ElectricCar implements Vehicle {

    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery: 65%");
    }
}
