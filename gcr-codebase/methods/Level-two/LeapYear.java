import java.util.Scanner;

// Create LeapYear Class to check wheather a year is leap year or not 
public class LeapYear{
   
    // Method to check leap year 
    public void findLeapyear (int year){	    
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
	}

    public static void main(String[] args) {
		// Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		// Get the input value for year
		int year  = sc.nextInt();
		
	    LeapYear leapYear = new LeapYear();
		
		// Call the method to get result
        leapYear.findLeapyear(year);
        
        // Close the Scanner object
        sc.close(); 
	}   
     
}