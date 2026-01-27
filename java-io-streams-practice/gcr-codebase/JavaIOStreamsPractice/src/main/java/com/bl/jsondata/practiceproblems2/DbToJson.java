package com.bl.jsondata.practiceproblems2;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.*;
import java.util.*;

public class DbToJson {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","admindisha26");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT id, name FROM student");

        List<Map<String,Object>> list = new ArrayList<>();
        while(rs.next()){
            Map<String,Object> row = new HashMap<>();
            row.put("id", rs.getInt("id"));
            row.put("name", rs.getString("name"));
            list.add(row);
        }
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list));
        conn.close();
    }
}
