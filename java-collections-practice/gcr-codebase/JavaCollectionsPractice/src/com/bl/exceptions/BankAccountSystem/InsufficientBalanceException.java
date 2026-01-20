package com.bl.exceptions.BankAccountSystem;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
