package com.bl.generics.resumescreeningsystem;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>("Amit", 3, new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Neha", 2, new DataScientist());

        Resume<ProductManager> r3 =
                new Resume<>("Rahul", 5, new ProductManager());

        ResumeScreeningUtil.screenResume(r1);
        ResumeScreeningUtil.screenResume(r2);
        ResumeScreeningUtil.screenResume(r3);

        ScreeningPipeline.processAll(
                Arrays.asList(
                        new SoftwareEngineer(),
                        new DataScientist(),
                        new ProductManager()
                )
        );
    }
}
