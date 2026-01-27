package com.bl.csvdatahandling.validatecsvdatabeforeprocessing;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;

public class ValidateCSVData {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("D:\\scenariospecifidir\\students.csv"));
        String line;

        // Regex patterns
        Pattern emailPattern =
                Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Pattern phonePattern =
                Pattern.compile("^[0-9]{10}$");

        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            String email = data[2];
            String phone = data[3];

            boolean valid = true;

            if (!emailPattern.matcher(email).matches()) {
                System.out.println(" Invalid Email → " + line);
                valid = false;
            }

            if (!phonePattern.matcher(phone).matches()) {
                System.out.println(" Invalid Phone → " + line);
                valid = false;
            }

            if (!valid) {
                System.out.println("Error in above row\n");
            }
        }
        br.close();
    }
}
