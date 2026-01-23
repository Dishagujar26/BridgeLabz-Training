package com.bl.streams.serialization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializeEmployee {

    public static void main(String[] args) {

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("C:\\Users\\acer\\OneDrive\\Desktop\\employees.ser.txt"))) {

            @SuppressWarnings("unchecked")
			List<Employee> employees =
                    (List<Employee>) ois.readObject();

            for (Employee emp : employees) {
                System.out.println(emp);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
