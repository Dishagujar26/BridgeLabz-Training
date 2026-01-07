package com.bl.day6.loanapprovalautomation;

public class LoanApplication implements IApprovable {
	protected Applicant applicant;
	protected int term;
	protected double interestRate;
	private boolean approved;

	public LoanApplication(Applicant applicant, int term, double interestRate) {
		this.applicant = applicant;
		this.term = term;
		this.interestRate = interestRate;
	}

	protected void setApproved(boolean status) {
		this.approved = status;
	}

	public boolean approveLoan() {
		if (applicant.getCreditScore() >= 650 && applicant.getIncome() > applicant.getLoanAmount() / 10) {
			setApproved(true);
		} else {
			setApproved(false);
		}
		return approved;
	}

	protected double emiFormula() {
		double P = applicant.getLoanAmount();
		double R = interestRate / 12 / 100;
		int N = term * 12;
		return (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);
	}

	@Override
	public double calculateEMI() {
		// TODO Auto-generated method stub
		return 0;
	}
}
