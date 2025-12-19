// Create LeapYear class to find the provided year is leap year or not 
import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args){
	    // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
		// Get input value for year
		int year = sc.nextInt();

        // Checking leap year through multiple conditions
        if ((year < 1582)) {
            System.out.println("Year should be equal or greater then 1582 ");
        }
		else{
		    
			// Year divisible by 4 and not 100 is a leap year
            if (year % 4 != 0) {
                System.out.println(year + " is not a Leap Year");
            } 
			else{
                if(year % 100 != 0){
                    System.out.println(year + " is a Leap Year");
                } 
				else{
					
					// Divisible by 400 is a leap year
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year");
                    }
					else {
                        System.out.println(year + " is not a Leap Year");
                    }
                }
            }
        }
		
		// Close the Scanner Stream
        sc.close();
    }
}
