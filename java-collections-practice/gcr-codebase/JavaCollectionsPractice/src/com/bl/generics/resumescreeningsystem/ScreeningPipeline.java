package com.bl.generics.resumescreeningsystem;

import java.util.List;

public class ScreeningPipeline {

    public static void processAll(List<? extends JobRole> roles) {
        System.out.println("Processing resumes for roles:");
        for (JobRole role : roles) {
            System.out.println("- " + role.getRoleName());
        }
    }
}
