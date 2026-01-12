package com.bl.day1.emergencypatientnavigation;

class HospitalUnit {
	String name;
	boolean available;
	HospitalUnit next;

	HospitalUnit(String name, boolean available) {
		this.name = name;
		this.available = available;
	}
}
