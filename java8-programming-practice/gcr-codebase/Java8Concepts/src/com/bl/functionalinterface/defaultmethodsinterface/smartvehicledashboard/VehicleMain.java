package com.bl.functionalinterface.defaultmethodsinterface.smartvehicledashboard;
public class VehicleMain {
    public static void main(String[] args) {

        Vehicle vehicle = new ElectricCar();
        vehicle.displaySpeed();
        vehicle.displayBattery();
    }
}
