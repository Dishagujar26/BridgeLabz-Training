package com.bl.collections.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.Objects;

public class Policy {

	String policyNumber;
    String policyholderName;
    LocalDate expiryDate;
    double premiumAmount;

    Policy(String policyNumber, String policyholderName, LocalDate expiryDate, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyholderName + " | " + expiryDate + " | $" + premiumAmount;
    }
}
