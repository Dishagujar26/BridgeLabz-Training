package com.bl.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class HospitalTriageSystem {
	public static class Patient implements Comparable<Patient> {
		String name;
		int severity;

		public Patient(String name, int severity) {
			super();
			this.name = name;
			this.severity = severity;
		}

		@Override
		public String toString() {
			return "Patient [name=" + name + ", severity=" + severity + "]";
		}

		public int compareTo(Patient other) {
			// higher severity = higher priority
			return other.severity - this.severity;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Patient> pq = new PriorityQueue<>();
		System.out.println("How many patients you wanna add: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter name of patient: ");
			String name = sc.nextLine();
			System.out.println("Enter the severity: ");
			int sev = sc.nextInt();
			sc.nextLine();

			Patient p = new Patient(name, sev);
			pq.add(p);
		}
		System.out.println(pq);
	}

}
