package com.bl.functionalinterface.defaultmethodsinterface.smartvehicledashboard;
public interface Vehicle {

    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery info not available");
    }
}
