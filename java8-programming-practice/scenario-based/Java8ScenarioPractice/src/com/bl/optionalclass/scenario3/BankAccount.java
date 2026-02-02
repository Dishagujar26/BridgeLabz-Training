package com.bl.optionalclass.scenario3;

import java.util.Optional;

class BankAccount {
	String accountNo;
	String nominee;
	Double balance;
	String transactionRef;
	String creditCard;

	BankAccount(String accountNo, String nominee, Double balance, String transactionRef, String creditCard) {
		this.accountNo = accountNo;
		this.nominee = nominee;
		this.balance = balance;
		this.transactionRef = transactionRef;
		this.creditCard = creditCard;
	}

	Optional<String> getNominee() {
		return Optional.ofNullable(nominee);
	}

	Optional<Double> getBalance() {
		return Optional.ofNullable(balance);
	}

	Optional<String> getTransactionRef() {
		return Optional.ofNullable(transactionRef);
	}

	Optional<String> getCreditCard() {
		return Optional.ofNullable(creditCard);
	}
}
