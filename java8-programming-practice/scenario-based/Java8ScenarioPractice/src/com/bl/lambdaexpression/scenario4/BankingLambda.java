package com.bl.lambdaexpression.scenario4;

import java.util.Arrays;
import java.util.List;

public class BankingLambda {
	public static void main(String[] args) {
		Account a1 = new Account("AC101", 1500, 5);
		Account a2 = new Account("AC102", 500, 6);

		List<Account> accounts = Arrays.asList(a1, a2);

		// 1. Minimum balance check (>1000)
		accounts.forEach(a -> System.out.println(a.accNo + " MinBalance ok? " + (a.balance > 1000)));

		// 2. Simple interest calculation (SI=Balance*Rate*1/100)
		accounts.forEach(a -> System.out.println(a.accNo + " SI: " + (a.balance * a.rate / 100)));

		// 3. Validate withdrawal (< balance)
		accounts.forEach(a -> System.out.println(a.accNo + " Withdrawal valid? " + (1000 < a.balance)));

		// 4. Print account details
		accounts.forEach(System.out::println);

		// 5. Compare two balances
		System.out.println("Compare balances: " + Double.compare(a1.balance, a2.balance));
	}
}
