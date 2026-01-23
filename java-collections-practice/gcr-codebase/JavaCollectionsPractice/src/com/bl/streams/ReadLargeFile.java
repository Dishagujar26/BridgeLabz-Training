package com.bl.streams;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadLargeFile {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\application.log"))) {

            String line;

            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
