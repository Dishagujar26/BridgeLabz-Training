package com.bl.inputstreamreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleToFileExample {

    public static void main(String[] args) {

        String filePath = "C:/Users/acer/OneDrive/Desktop/output.txt";

        try (
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            FileWriter fw = new FileWriter(filePath, true) // append mode
        ) {

            System.out.println("Enter text (type 'exit' to stop):");

            String input;
            while ((input = br.readLine()) != null) {

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                fw.write(input);
                fw.write(System.lineSeparator());
            }

            System.out.println("Input saved to file successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
