package com.bl.collections.bankingsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BankingSystem {

	HashMap<String, Double> accounts = new HashMap<>();
	TreeMap<Double, List<String>> sortedByBalance = new TreeMap<>();
	Queue<WithdrawalRequest> requests = new LinkedList<>();

	// Add a new account
	public void addAccount(String accNumber, double balance) {
		accounts.put(accNumber, balance);
		sortedByBalance.computeIfAbsent(balance, k -> new ArrayList<>()).add(accNumber);
	}

	// Add withdrawal request
	public void addWithdrawalRequest(String accNumber, double amt) {
		requests.add(new WithdrawalRequest(accNumber, amt));
	}

	// Process withdrawal queue
	public void processRequests() {
		while (!requests.isEmpty()) {
			WithdrawalRequest req = requests.remove();
			double currentBalance = accounts.getOrDefault(req.accountNumber, 0.0);
			if (currentBalance >= req.amount) {
				accounts.put(req.accountNumber, currentBalance - req.amount);
				System.out.println("Processed withdrawal: " + req.accountNumber + " $" + req.amount);
			} else {
				System.out.println("Insufficient balance for: " + req.accountNumber);
			}
		}
	}

	// Display accounts sorted by balance
	public void displayAccountsSortedByBalance() {
		TreeMap<Double, List<String>> sorted = new TreeMap<>();
		for (Map.Entry<String, Double> e : accounts.entrySet()) {
			sorted.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
		}
		System.out.println("Accounts sorted by balance: " + sorted);
	}
}
