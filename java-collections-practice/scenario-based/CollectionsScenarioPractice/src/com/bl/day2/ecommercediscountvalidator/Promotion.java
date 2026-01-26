package com.bl.day2.ecommercediscountvalidator;

import java.time.LocalDate;

public abstract class Promotion {
	protected String dealCode;
	protected LocalDate validTill;

	public String getDealCode() {
		return dealCode;
	}

	public LocalDate getValidTill() {
		return validTill;
	}
}
