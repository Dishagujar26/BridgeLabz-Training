package com.bl.day6.smartparkingmanagementsystem;

public class ParkingSlot {
	private String slotId;
	private boolean isOccupied;
	private String vehicleTypeAllowed;

	public ParkingSlot(String slotId, String vehicleTypeAllowed) {
		this.slotId = slotId;
		this.vehicleTypeAllowed = vehicleTypeAllowed;
		this.isOccupied = false;
	}

	public boolean bookSlot() {
		if (!isOccupied) {
			isOccupied = true;
			return true;
		}
		return false;
	}

	public void releaseSlot() {
		isOccupied = false;
	}

	public String getStatus() {
		return isOccupied ? "Occupied" : "Available";
	}
}
