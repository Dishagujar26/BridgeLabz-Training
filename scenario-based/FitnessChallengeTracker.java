/*
  13. Sandeep’s Fitness Challenge Tracker
  Each day Sandeep completes a number of push-ups.
  Store counts for a week.
  Use for-each to calculate total and average.
  Use continue to skip rest days.
*/

import java.util.Scanner;

public class FitnessChallengeTracker{
    public static void main(String []args){
	    Scanner sc = new Scanner(System.in);
		
		// array to store the push-ups counts
	    int []week = new int[5];
		
		System.out.println("------------------------------------");
		System.out.println(" SANDEEP FITNESS CHALLENGE TRACKER ");
		System.out.println("------------------------------------");

        // variable to store total push-ups in a week
		int totalPushUps = 0;
		
        // loop to get the user input
		for(int i=0;i<7;i++){		    
			System.out.println("Enter the push-up counts for day "+ (i+1));
		    week[i] = sc.nextInt();
		}
		
		int idx = 1;
		for(int e : week){
			if(e == 0){
				continue;
			}
		    totalPushUps += e;	
		}
		
		// variable to store average 
		double average = totalPushUps/7;
		
		//display average push-ups
		System.out.println("Sandeep's average push-ups in week-days "+ average);
	   
	    // close the Scanner stream
        sc.close();	   
	}
}