package com.bl.csvdatahandling.modifyacsvfile;
import java.io.*;

public class UpdateSalary {
    public static void main(String[] args) {
        String inputFile = "D:\\scenariospecifidir\\data\\employees.csv";
        String outputFile = "D:\\scenariospecifidir\\data\\employees_updated.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line = br.readLine(); // header
            bw.write(line + "\n");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(data[3]);
                    salary = salary * 1.10;
                    data[3] = String.valueOf((int) salary);
                }

                bw.write(String.join(",", data));
                bw.newLine();
            }

            System.out.println("Updated CSV created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
