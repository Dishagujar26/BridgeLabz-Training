package com.bl.streams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UnbufferedCopy {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        try(FileInputStream fis = new FileInputStream("C:\\Users\\acer\\OneDrive\\Desktop\\largeFile.dat");
             FileOutputStream fos = new FileOutputStream("unbufferedCopy.dat")) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("Unbuffered Time: " + (endTime - startTime) + " ns");
    }
}
