/*
 12. Train Reservation Queue
 Simulate a basic ticket booking system.
 Show menu with switch
 Allow multiple bookings using while-loop.
 Stop booking once seats reach zero (break).
*/

import java.util.Scanner;

public class TrainReservation{
    public static void main(String []args){
	    Scanner sc = new Scanner(System.in);
		
		// variable to set initial train capacity 
		int trainSeats = 10;
		
		System.out.println("\n=== WELCOME TO THE TRAIN RESERVATION SYSTEM ===");
		System.out.println("\n=== Tokaido Shinkanse ===");
		System.out.println("\n---------------------------------------------------------------------------------------------");
		System.out.println("Nozomi Train's Travel Route");
        System.out.println("Tokyo (0 min) -> Shinagawa (6 min) -> Nagoya (1h 40m) -> Kyoto (2h 15m) -> Shin-Osaka (2h 30m)");
		System.out.println("---------------------------------------------------------------------------------------------");
	
		while(true){
		    
			System.out.println("\n---Nozomi 101 Schedule---");
            System.out.println("Tokyo       : Start 06:00 AM");
            System.out.println("Shinagawa   : Reach 06:06 AM"); 
            System.out.println("Nagoya      : Reach 07:40 AM");
            System.out.println("Kyoto       : Reach 08:15 AM");
            System.out.println("Shin-Osaka  : Reach 08:30 AM");
			
			System.out.println("\nWhere do you want to travel?");
			String choice = sc.next();
			
			switch(choice.toLowerCase()){
			    case "shinagawa":
				    if(trainSeats > 0){
					    System.out.println("\nNozomi Train's Reservation Successful!\nDestination - Shinagawa\nReach Timing - 06:06 AM\nFair - 1,500 yen");
				        trainSeats--;
                        break;						
			        }
					else{
					    System.out.println("Sorry, No Available Seats!");
						return;
					}
	
					
				case "nagoya":
                    if(trainSeats > 0){
				        System.out.println("\nNozomi Train's Reservation Successful!\nDestination - Nagoya\nReach Timing - 07:40 AM\nFair - 11,300 yen");
				        trainSeats--;
                        break;						
			        }
					else{
					    System.out.println("Sorry, No Available Seats!");
						return;
					}					
			        
					
				case "kyoto":
                    if(trainSeats > 0){
				        System.out.println("\nNozomi Train's Reservation Successful!\nDestination - Kyoto\nReach Timing - 08:15 AM\nFair - 14,200 yen");
				        trainSeats--;	
                        break;						
			        }
					else{
					    System.out.println("Sorry, No Available Seats!");
						return;
					}						
					
				case "shin-osaka":	
                    if(trainSeats > 0){
				        System.out.println("\nNozomi Train's Reservation Successful!\nDestination - Shin-Osaka\nReach Timing - 08:30 AM\nFair - 14,720 yen");
				        trainSeats--;	
                        break;						
			        }
					else{
					    System.out.println("Sorry, No Available Seats!");
						return;
					}					
					
				default:
				    System.out.println("Invalid Choice");
			}			
				
		}		
	    	
	}
}