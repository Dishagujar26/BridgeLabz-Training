package com.bl.day6.loanapprovalautomation;

public class AutoLoan extends LoanApplication {
	public AutoLoan(Applicant applicant, int term) {
		super(applicant, term, 10.5);
	}

	public double calculateEMI() {
		return emiFormula() + 500; // processing fee impact
	}
}
