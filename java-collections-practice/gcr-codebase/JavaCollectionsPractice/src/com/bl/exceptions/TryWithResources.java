package com.bl.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources{
    public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\csvfile.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
