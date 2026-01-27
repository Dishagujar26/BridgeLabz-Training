package com.bl.jsondata.practiceproblems.objecttojson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CarToJSON {
    public static void main(String[] args) throws Exception {
        Car car = new Car("Toyota", "Camry", 2023);

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(car);

        System.out.println(jsonString);
    }
}