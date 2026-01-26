package com.bl.reflection.advancedproblems.customobjectmapper;

import java.util.HashMap;
import java.util.Map;

public class ObjectMapperMain {
    public static void main(String[] args) throws Exception {

        Map<String, Object> map = new HashMap<>();
        map.put("name", "Disha");
        map.put("age", 23);

        Person p = ObjectMapperUtil.toObject(Person.class, map);
        System.out.println(p.name + " " + p.age);
    }
}