package com.bl.collections.bankingsystem;

public class WithdrawalRequest {
	String accountNumber;
	double amount;

	WithdrawalRequest(String acc, double amt) {
		accountNumber = acc;
		amount = amt;
	}

}
