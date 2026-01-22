package com.bl.day9.sortingmedicinesbyexpiry;

import java.time.LocalDate;

public class Medicine {
	boolean isNear;
	String name;
	LocalDate date;

	public Medicine(boolean isNear, String name, LocalDate date) {
		super();
		this.isNear = isNear;
		this.name = name;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Medicine [isNear=" + isNear + ", name=" + name + ", date=" + date + "]";
	}

	public LocalDate getDate() {
		return date;
	}

}
