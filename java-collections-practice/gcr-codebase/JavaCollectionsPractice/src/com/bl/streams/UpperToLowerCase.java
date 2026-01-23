package com.bl.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpperToLowerCase {

	public static void main(String[] args) {

		try (

				BufferedReader br = new BufferedReader(
						new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\csvfile - Copy.txt"));

				BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {

			String line;

			while ((line = br.readLine()) != null) {
				bw.write(line.toLowerCase());
				bw.newLine();
			}

			System.out.println("File converted successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
