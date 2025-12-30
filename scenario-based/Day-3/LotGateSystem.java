/*
   6. Parking Lot Gate System
   Develop a smart parking system.
   Options: Park, Exit, Show Occupancy
   Use switch-case for the menu.
   while loop to continue until the parking lot is full or the user exits.
*/

import java.util.Scanner;

public class LotGateSystem{
    public static void main(String []args){
	    Scanner sc = new Scanner(System.in);
		
		//set initial parking lot size
		int totalParkingLots = 100;
		
		System.out.println("Welcome To The Parking Lot Gate System!");
		System.out.println("=========================================");
		System.out.println();

		
		//variable to track total vehicle
		int totalVehicle = 0;
		String choice2;
		
		do{
		    System.out.println("What you want to do?\n1.Park\n2.Exit\n3.See Remaining Lots\n4.Show Occupancy");
			int choice = sc.nextInt();
			
		    switch(choice){
		        case 1:
				    if(totalVehicle > totalParkingLots){
					    System.out.println("Sorry, All Parking Lots Are Occupied!");
						break;
					}
			        else{
					    totalVehicle++;
			            System.out.println("Vehicle Parked Successfully!");
						break;
					}
			
			    case 2:
			        System.out.println("Vehicle Exited!");
				    totalVehicle--;
				    break;
			    
				case 3:
				    System.out.println("Remaining Lots : "+ (totalParkingLots-totalVehicle));
					break;
					
			    case 4:
				    System.out.println("Total Vehicles Parked : "+ totalVehicle);
					break;
				
				default:
				    System.out.println("Invalid Choice!");
			}
			
			System.out.println("----------------------------------------");
			System.out.println("Do you want to continue? (yes/no)");
			choice2 = sc.next();
			System.out.println();
			
		}while(choice2.equalsIgnoreCase("yes"));
		System.out.println("Thank You For Using The System!");

        sc.close();
	}
}
		
			
				