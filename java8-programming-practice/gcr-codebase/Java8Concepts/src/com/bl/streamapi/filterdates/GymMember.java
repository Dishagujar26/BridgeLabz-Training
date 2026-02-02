package com.bl.streamapi.filterdates;

import java.time.LocalDate;



public class GymMember {

	String name;
	LocalDate date;

	public GymMember(String name, LocalDate date) {
		super();
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}
	public LocalDate getDate() {
		return date;
	}
}
