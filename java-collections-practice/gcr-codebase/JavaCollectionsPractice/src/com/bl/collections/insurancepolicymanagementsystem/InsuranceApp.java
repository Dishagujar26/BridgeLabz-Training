package com.bl.collections.insurancepolicymanagementsystem;

import java.time.LocalDate;

public class InsuranceApp {

	public static void main(String[] args) {
		PolicyManager manager = new PolicyManager();

		// Add sample policies
		manager.addPolicy(new Policy("P001", "Alice", LocalDate.now().plusDays(10), 500.0));
		manager.addPolicy(new Policy("P002", "Bob", LocalDate.now().plusDays(40), 300.0));
		manager.addPolicy(new Policy("P003", "Alice", LocalDate.now().plusDays(25), 450.0));
		manager.addPolicy(new Policy("P004", "Charlie", LocalDate.now().minusDays(5), 600.0));

		System.out.println("All Policies:");
		manager.displayAllPolicies();

		System.out.println("\nPolicies expiring in next 30 days:");
		for (Policy p : manager.listPoliciesExpiringInNextDays(30)) {
			System.out.println(p);
		}

		System.out.println("\nPolicies for Alice:");
		for (Policy p : manager.listPoliciesByPolicyholder("Alice")) {
			System.out.println(p);
		}

		System.out.println("\nRemoving expired policies...");
		manager.removeExpiredPolicies();

		System.out.println("\nAll Policies after removing expired:");
		manager.displayAllPolicies();

		// Retrieve policy by number
		System.out.println("\nRetrieve policy P002:");
		System.out.println(manager.getPolicy("P002"));
	}
}
