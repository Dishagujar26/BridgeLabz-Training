package com.bl.day1.apimetadatavalidator;

import java.lang.reflect.Method;

public class HealthCheckPro {

    public static void main(String[] args) {

        Class<?> controllerClass = LabTestController.class;

        System.out.println("Scanning Controller: " + controllerClass.getSimpleName());

        for (Method method : controllerClass.getDeclaredMethods()) {

            if (method.isAnnotationPresent(PublicAPI.class)) {

                PublicAPI api = method.getAnnotation(PublicAPI.class);

                System.out.println("\nAPI Method: " + method.getName());
                System.out.println("Description: " + api.description());

                if (method.isAnnotationPresent(RequiresAuth.class)) {
                    RequiresAuth auth = method.getAnnotation(RequiresAuth.class);
                    System.out.println("Auth Required: YES");
                    System.out.println("Role: " + auth.role());
                } else {
                    System.out.println("ERROR: Missing @RequiresAuth annotation");
                }
            }
        }
    }
}
