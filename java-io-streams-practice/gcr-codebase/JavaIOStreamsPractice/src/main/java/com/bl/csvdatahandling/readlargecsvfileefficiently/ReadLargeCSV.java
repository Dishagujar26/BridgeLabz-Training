package com.bl.csvdatahandling.readlargecsvfileefficiently;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLargeCSV {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("D:\\scenariospecifidir\\large.csv"));
        String line;
        int count = 0;
        int batchSize = 100;

        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            count++;

            // process current line here (if needed)

            if (count % batchSize == 0) {
                System.out.println("Processed records: " + count);
            }
        }

        // print remaining count
        System.out.println("Total records processed: " + count);
        br.close();
    }
}
