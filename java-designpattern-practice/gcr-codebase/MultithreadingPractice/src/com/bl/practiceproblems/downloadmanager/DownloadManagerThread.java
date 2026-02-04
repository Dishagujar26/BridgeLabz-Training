package com.bl.practiceproblems.downloadmanager;

public class DownloadManagerThread {
	public static void main(String[] args) throws Exception {
		Thread t1 = new FileDownloader("Document.pdf");
		Thread t2 = new FileDownloader("Image.jpg");
		Thread t3 = new FileDownloader("Video.mp4");

		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();

		System.out.println("All downloads complete!");
	}
}