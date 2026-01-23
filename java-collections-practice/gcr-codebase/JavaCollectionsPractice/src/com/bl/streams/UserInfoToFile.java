package com.bl.streams;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInfoToFile {

    public static void main(String[] args) {

        try (
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            FileWriter fw = new FileWriter("userInfo.txt")
        ) {

            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Favorite Language: " + language + "\n");

            System.out.println("User information saved successfully.");

        } catch (IOException e) {
            System.out.println("Error occurred while reading input or writing file.");
            e.printStackTrace();
        }
    }
}
