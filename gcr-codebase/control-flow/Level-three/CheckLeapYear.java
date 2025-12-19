// Create CheckLeapYear class to find the provided year is leap year or not using single condition
import java.util.Scanner;

public class CheckLeapYear{
    public static void main(String[] args){
	    // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
		// Get input value for year
		int year = sc.nextInt();

        // Checking leap year through single condition
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))){
            System.out.println(year + " is a Leap Year"); 
        }
		else{
            System.out.println(year + " is not a Leap Year"); 		
	    }
		
		// Close the Scanner Stream
        sc.close();
    }
}