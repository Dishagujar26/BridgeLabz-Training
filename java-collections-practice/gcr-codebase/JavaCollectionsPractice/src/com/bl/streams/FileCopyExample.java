package com.bl.streams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {

    public static void main(String[] args) {

    	File sourceFile = new File("C:\\Users\\acer\\OneDrive\\Desktop\\csvfile - Copy.txt");
    	File destFile   = new File("C:\\Users\\acer\\OneDrive\\Desktop\\csvfile.txt");


        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        // try-with-resources
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error occurred while reading/writing file.");
            e.printStackTrace();
        }
    }
}
