package com.bl.day1.apimetadatavalidator;

public class LabTestController {

    @PublicAPI(description = "Fetch blood test report")
    @RequiresAuth(role = "DOCTOR")
    public void getBloodTest() {
    }

    @PublicAPI(description = "Fetch urine test report")
    public void getUrineTest() {
        // Missing RequiresAuth → should be flagged
    }
}
