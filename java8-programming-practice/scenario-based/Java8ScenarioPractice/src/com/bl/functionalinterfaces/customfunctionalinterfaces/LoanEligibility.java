package com.bl.functionalinterfaces.customfunctionalinterfaces;

@FunctionalInterface
public interface LoanEligibility {
	boolean check(double salary, double debt);
}