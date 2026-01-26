package com.bl.regularexpression.basicregexproblems;

public class ValidateIPAddress {
	static boolean validateIP(String ip) {
		return ip.matches("((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}" + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)");
	}

	public static void main(String[] args) {
		String ip = "192.168.1.1";
		System.out.println(
				ip.matches("((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}" + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)"));
	}
}
