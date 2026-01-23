package com.bl.streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ImageByteArrayExample {

	public static void main(String[] args) {
		byte[] imageBytes = null;
		String sourcePath = "C:\\Users\\acer\\Downloads\\bf3.jpg";
		String copyPath = "copy.jpg";

		try (FileInputStream fis = new FileInputStream(sourcePath);
				ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

			byte[] buffer = new byte[4096];
			int bytesRead;
			while ((bytesRead = fis.read(buffer)) != -1) {
				baos.write(buffer, 0, bytesRead);
			}
			imageBytes = baos.toByteArray();

		} catch (IOException e) {
			e.printStackTrace();
		}

		if (imageBytes != null) {
			try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
					FileOutputStream fos = new FileOutputStream(copyPath)) {

				byte[] buffer = new byte[4096];
				int bytesRead;
				while ((bytesRead = bais.read(buffer)) != -1) {
					fos.write(buffer, 0, bytesRead);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// Verification
		try (FileInputStream fis1 = new FileInputStream(sourcePath);
				FileInputStream fis2 = new FileInputStream(copyPath)) {

			byte[] original = fis1.readAllBytes();
			byte[] copied = fis2.readAllBytes();

			System.out.println("Images identical: " + Arrays.equals(original, copied));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}