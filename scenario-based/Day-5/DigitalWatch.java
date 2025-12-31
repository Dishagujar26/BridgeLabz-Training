/*
 16. Digital Watch Simulation
 Simulate a 24-hour watch:
 Print hours and minutes in a nested for-loop.
 Use a break to stop at 13:00 manually (simulate power cut).
 Core Java Scenario Based Problem Statements
*/

public class DigitalWatch{
    public static void main(String []args){
	    System.out.println("DIGITAL WATCH SIMULATION");
		System.out.println("Watch is scheduled to stop at 13:00\n");
		
		for(int hour =0; hour<24; hour++){
		    for(int minute =0; minute<60; minute++){
			    if(hour == 13 && minute == 0){
					return;
				}
				System.out.printf("Current Time is - %02d:%02d\n", hour, minute);
			}
		}
	}
}
				