package com.bl.jsondata.practiceproblems.listofobjtojsonarray;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class ListToJSONArray {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        List<User> users = new ArrayList<>();
        users.add(new User(){{
            setName("Disha"); setEmail("disha@example.com"); setAge(22);
        }});
        users.add(new User(){{
            setName("Rohan"); setEmail("rohan@example.com"); setAge(30);
        }});

        String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);
        System.out.println(jsonArray);
    }
}
