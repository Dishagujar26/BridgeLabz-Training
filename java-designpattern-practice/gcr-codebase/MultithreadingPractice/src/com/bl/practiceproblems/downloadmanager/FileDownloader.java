package com.bl.practiceproblems.downloadmanager;

public class FileDownloader extends Thread {
	private String fileName;

	FileDownloader(String fileName) {
		this.fileName = fileName;
	}

	public void run() {
		for (int i = 0; i <= 100; i += 25) {
			System.out.println("[" + Thread.currentThread().getName() + "] Downloading " + fileName + ": " + i + "%");
			try {
				Thread.sleep((long) (Math.random() * 500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}