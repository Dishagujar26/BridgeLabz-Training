package com.bl.jsondata.practiceproblems2.listtojsonarray;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ListToJson {
    public static void main(String[] args) throws Exception {
        List<User> users = Arrays.asList(new User("Alice", 30), new User("Bob", 22));
        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writeValueAsString(users);
        System.out.println(jsonArray);
    }
}