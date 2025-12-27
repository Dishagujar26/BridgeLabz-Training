package com.bl.constructor;

public class BankAccountMain {
	
	 public static void main(String[] args) {
		 SavingsAccount sa = new SavingsAccount(1234567890L,"Disha", 50000, 4.5);
		 sa.displaySavingsAccount();
         sa.deposit(10000);
	     sa.withdraw(5000);

	     System.out.println("\nUpdated Balance: ₹" + sa.getBalance());
	    }

}
