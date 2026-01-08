package com.bl.challengeproblems;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerformanceComparison {

    public static void main(String[] args) {

        String sample = "hello";
        int iterations = 1_000_000;

        // StringBuilder
        long startSB = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(sample);
        }
        long endSB = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endSB - startSB) + " ms");

        // StringBuffer
        long startSBuf = System.currentTimeMillis();
        StringBuffer sBuf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sBuf.append(sample);
        }
        long endSBuf = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (endSBuf - startSBuf) + " ms");

        String filePath = "C:/Users/acer/OneDrive/Desktop/Sample.txt";

        // FileReader
        try {
            long startFR = System.currentTimeMillis();
            BufferedReader brFR = new BufferedReader(new FileReader(filePath));
            int wordCountFR = 0;
            String line;
            while ((line = brFR.readLine()) != null) {
                wordCountFR += line.split("\\s+").length;
            }
            brFR.close();
            long endFR = System.currentTimeMillis();
            System.out.println("FileReader word count: " + wordCountFR);
            System.out.println("FileReader time: " + (endFR - startFR) + " ms");
        } catch (IOException e) {
            System.out.println("Error with FileReader: " + e.getMessage());
        }

        // InputStreamReader
        try {
            long startISR = System.currentTimeMillis();
            FileInputStream fis = new FileInputStream(filePath);
            BufferedReader brISR = new BufferedReader(
                    new InputStreamReader(fis, "UTF-8"));
            int wordCountISR = 0;
            String line;
            while ((line = brISR.readLine()) != null) {
                wordCountISR += line.split("\\s+").length;
            }
            brISR.close();
            long endISR = System.currentTimeMillis();
            System.out.println("InputStreamReader word count: " + wordCountISR);
            System.out.println("InputStreamReader time: " + (endISR - startISR) + " ms");
        } catch (IOException e) {
            System.out.println("Error with InputStreamReader: " + e.getMessage());
        }
    }
}
