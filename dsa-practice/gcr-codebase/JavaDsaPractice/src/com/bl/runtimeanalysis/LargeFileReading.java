package com.bl.runtimeanalysis;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class LargeFileReading {
	
    // Using FileReader
    static void readWithFileReader(String path) throws Exception {
        FileReader fr = new FileReader(path);
        int ch;
        while ((ch = fr.read()) != -1) {
            // reading character
        }
        fr.close();
    }

    // Using InputStreamReader 
    static void readWithInputStreamReader(String path) throws Exception {
        InputStreamReader isr =
                new InputStreamReader(new FileInputStream(path));
        int ch;
        while ((ch = isr.read()) != -1) {
            // reading character
        }
        isr.close();
    }

    public static void main(String[] args) throws Exception {
        String filePath = "largefile.txt";

        long start = System.currentTimeMillis();
        readWithFileReader(filePath);
        System.out.println("FileReader Time: " +
                (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        readWithInputStreamReader(filePath);
        System.out.println("InputStreamReader Time: " +
                (System.currentTimeMillis() - start) + " ms");
    }
}
