package com.bl.day1.studentmarksheetgenerator;

import java.io.File;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
public class EventTracker {

    public static void main(String[] args) throws Exception {

        List<AuditLog> logs = new ArrayList<>();
        Class<?> clazz = UserActions.class;

        for (Method method : clazz.getDeclaredMethods()) {

            if (method.isAnnotationPresent(AuditTrail.class)) {

                AuditTrail audit = method.getAnnotation(AuditTrail.class);

                logs.add(new AuditLog(
                        audit.event(),
                        clazz.getSimpleName(),
                        method.getName(),
                        LocalDateTime.now()
                ));
            }
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules(); // for LocalDateTime
        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File("D:\\scenariospecifidir\\audit-log.json"), logs);

        System.out.println("Audit log generated successfully");
    }
}
