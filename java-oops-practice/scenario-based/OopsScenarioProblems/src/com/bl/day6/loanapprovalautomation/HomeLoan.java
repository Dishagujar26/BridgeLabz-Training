package com.bl.day6.loanapprovalautomation;

public class HomeLoan extends LoanApplication {
	public HomeLoan(Applicant applicant, int term) {
		super(applicant, term, 8.5);
	}

	public double calculateEMI() {
		return emiFormula();
	}
}
