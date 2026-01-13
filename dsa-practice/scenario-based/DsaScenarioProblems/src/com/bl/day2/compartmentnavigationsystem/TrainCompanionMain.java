package com.bl.day2.compartmentnavigationsystem;

import java.util.Scanner;

public class TrainCompanionMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Train Companion Application");
		CompartmentNavigation cn = new CompartmentNavigation();

		while(true) {
			System.out.println("What yout want to do?\n1. Add Compartment\n2. Navigate Back\n3. Navigate Forword\n4. Remove Compartment\n5. Show Adjacent Compartment\n6. Show All Compartment\n7. Exit");
			int choice = sc.nextInt();
		    sc.nextLine();
		    
		    if(choice == 1) {
		    	System.out.println("Enter the compartment number: ");
		    	int no = sc.nextInt();
		    	cn.addCompartment(no);
		    }
		    else if(choice == 2) {
		    	System.out.println("Navigating back...");
		        Compartment c = cn.navigateBack();
		        System.out.println("Navigated to compartment number "+ c.no);
		    }
		    else if(choice == 3) {
		    	System.out.println("Navigating forward...");
		    	Compartment c = cn.navigateForword();
		        System.out.println("Navigated to compartment number "+ c.no);
		    }
		    else if(choice == 4) {
		    	System.out.println("Enter the compartment number to be removed: ");
		    	int no = sc.nextInt();
		    	cn.removeCompartment(no);
		    }
		    else if(choice == 5) {
		    	System.out.println("Adjacent compartments: ");
		    	cn.showAdjacent();
		    }
		    else if(choice == 6) {
		    	System.out.println("All Compartments in Train: ");
		    	cn.showAllCompartment();
		    }
		    else if(choice == 7) {
		    	System.out.println("Thank you for using!!");
		    	break;
		    }
		    else{
		    	System.out.println("Invalid Choice!!");
		    	break;
		    }
		}
	    sc.close();
	}
}
