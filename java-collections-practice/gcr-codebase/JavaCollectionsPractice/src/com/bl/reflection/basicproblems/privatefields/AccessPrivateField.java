package com.bl.reflection.basicproblems.privatefields;

import java.lang.reflect.Field;

public class AccessPrivateField {

    public static void main(String[] args) throws Exception {

        Class<Person> p = Person.class;

        // create object
        Object obj = p.getDeclaredConstructor().newInstance();

        // get private field
        Field ageField = p.getDeclaredField("age");

        ageField.setAccessible(true);

        // set value
        ageField.setInt(obj, 30);

        // get value
        int age = ageField.getInt(obj);

        System.out.println("Modified Age: " + age);
    }
}
