package com.bl.day2.ewalletapplication;

public class User {
	private int id;
	private String name;
	private Wallet wallet;

	User(int id, String name, boolean referral) {
		this.id = id;
		this.name = name;
		this.wallet = new PersonalWallet(referral ? 100 : 0);
	}

	User(int id, String name, Wallet wallet) {
		this.id = id;
		this.name = name;
		this.wallet = wallet;
	}

	public Wallet getWallet() {
		return wallet;
	}
}
