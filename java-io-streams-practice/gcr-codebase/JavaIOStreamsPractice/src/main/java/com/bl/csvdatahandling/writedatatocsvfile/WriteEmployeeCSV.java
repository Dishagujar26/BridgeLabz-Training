package com.bl.csvdatahandling.writedatatocsvfile;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {
    public static void main(String[] args) {
        String filePath = "D:\\scenariospecifidir\\data\\students.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("ID,Name,Department,Salary\n");
            bw.write("1,Ravi,IT,50000\n");
            bw.write("2,Priya,HR,45000\n");
            bw.write("3,Karan,Finance,55000\n");
            bw.write("4,Sneha,Marketing,48000\n");
            bw.write("5,Anil,Admin,40000\n");

            System.out.println("Employee CSV file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
