package com.bl.csvdatahandling.encryptanddecryptcsvdata;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVEncryptDecrypt {
    public static void main(String[] args) {
        String inputCSV = "D:\\scenariospecifidir\\employee.csv";        // Original CSV
        String encryptedCSV = "D:\\scenariospecifidir\\employees_enc.csv"; // Encrypted CSV

        // Read original CSV and encrypt sensitive fields
        List<String[]> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputCSV))) {
            String line;
            records.add(br.readLine().split(",")); // header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                data[2] = AESUtil.encrypt(data[2]); // Encrypt Email
                data[4] = AESUtil.encrypt(data[4]); // Encrypt Salary
                records.add(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Write encrypted CSV
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(encryptedCSV))) {
            for (String[] row : records) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
            System.out.println("Encrypted CSV created: " + encryptedCSV);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read encrypted CSV and decrypt sensitive fields
        System.out.println("\nReading and Decrypting CSV:");
        try (BufferedReader br = new BufferedReader(new FileReader(encryptedCSV))) {
            String line;
            System.out.println(br.readLine()); // header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                data[2] = AESUtil.decrypt(data[2]); // Decrypt Email
                data[4] = AESUtil.decrypt(data[4]); // Decrypt Salary
                System.out.println(String.join(", ", data));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
