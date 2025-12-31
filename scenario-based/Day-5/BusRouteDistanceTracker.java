/*
19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/

import java.util.Scanner;
public class BusRouteDistanceTracker{
    public static void main(String []args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------------");
		System.out.println(" WELCOME TO BUS ROUTE DISTANCE TRACKER");
		System.out.println("---------------------------------------");
		
		int stopNumber = 1;
		double distanceTracker = 0.0;
		char choice = 'n';
		
		while(choice != 'y' && choice != 'Y'){
		    System.out.print("\nEnter distance travelled till stop "+ stopNumber+" (in kms): ");
			double distance = sc.nextDouble();
			
			distanceTracker += distance;
			
			System.out.println("Total distance covered so far: "+ distanceTracker+" km");
			
			System.out.println("Do you want to get off?(y/n): ");
			choice = sc.next().charAt(0);
			
			stopNumber++;
		}
		System.out.println("Passenger has got off the bus!! ");
		System.out.println("Total distance travelled: "+ distanceTracker);
	    
		sc.close();
	}
}
			
			
			
		