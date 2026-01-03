package com.bl.day2.ewalletapplication;

public class WalletMain {
	public static void main(String[] args) {

		User u1 = new User(1, "Amit", true);
		User u2 = new User(2, "Neha", new BusinessWallet(1000));

		u1.getWallet().transferTo(u2, 200);

		System.out.println("Amit Balance: " + u1.getWallet().getBalance());
		System.out.println("Neha Balance: " + u2.getWallet().getBalance());
	}
}
