package com.bl.streams.serialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SerializeEmployee {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Amit", "IT", 60000));
        employees.add(new Employee(2, "Neha", "HR", 50000));
        employees.add(new Employee(3, "Rahul", "Finance", 55000));

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("C:\\Users\\acer\\OneDrive\\Desktop\\employees.ser.txt"))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
