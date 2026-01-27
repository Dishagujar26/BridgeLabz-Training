package com.bl.csvdatahandling.detectduplicatesinacsvfile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateCSV {

    public static void main(String[] args) throws Exception {

        Set<String> ids = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\scenariospecifidir\\duplicatestudents.csv"));
        String line;

        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            String id = data[0];

            if (!ids.add(id)) {
                System.out.println("Duplicate Record Found → " + line);
            }
        }

        br.close();
    }
}
