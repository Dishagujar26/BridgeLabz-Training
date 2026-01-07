package com.bl.day6.smartparkingmanagementsystem;

public class ParkingRecord {
	private String log;

	public ParkingRecord(String log) {
		this.log = log;
	}

	public void showLog() {
		System.out.println("LOG: " + log);
	}
}
