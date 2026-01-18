package com.bl.day6.sortartistsbyregistrationtime;

public class Artist {

	private String name;
	private int registrationTime;

	public Artist(String name, int registrationTime) {
		this.name = name;
		this.registrationTime = registrationTime;
	}

	public int getRegistrationTime() {
		return registrationTime;
	}

	@Override
	public String toString() {
		return name + " (" + registrationTime + ")";
	}
}
