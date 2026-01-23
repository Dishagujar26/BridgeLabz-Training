package com.bl.streams.datainputstream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteStudentDataExample {

    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("C:\\Users\\acer\\OneDrive\\Desktop\\largeFile.dat"))) {

            // Example data (matching your read example)
            int rollNo = 101;
            String name = "Alice";
            double gpa = 9.5;

            // Write in the exact order that your ReadStudentData expects
            dos.writeInt(rollNo);
            dos.writeUTF(name);
            dos.writeDouble(gpa);

            System.out.println("largeFile.dat created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
