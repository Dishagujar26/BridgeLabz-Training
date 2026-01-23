package com.bl.streams.datainputstream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadStudentData {

    public static void main(String[] args) {

        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream("C:\\Users\\acer\\OneDrive\\Desktop\\largeFile.dat"))) {

            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
