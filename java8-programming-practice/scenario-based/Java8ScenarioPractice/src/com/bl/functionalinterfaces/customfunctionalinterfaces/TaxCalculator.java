package com.bl.functionalinterfaces.customfunctionalinterfaces;

@FunctionalInterface
public interface TaxCalculator {
	double compute(double income);
}