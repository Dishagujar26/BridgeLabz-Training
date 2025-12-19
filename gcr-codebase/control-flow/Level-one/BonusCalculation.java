import java.util.Scanner;

// Create BonusCalculation Class to compute bonus of employees

public class BonusCalculation{  
	public static void main(String []args){
	    
		// Create a Scanner object 
        Scanner sc = new Scanner(System.in);
		
        // Get input value of salary        		
		double salary = sc.nextDouble();
		
        // Get input value of year    		
		int year = sc.nextInt();
		
	    double bonus = 0.0;
		
		// Calculate bonus amount 
        if(year > 5){
            bonus = salary * 0.05;
        }    		
		
		System.out.println("Bonus is " + bonus);
		
		// Closing the Scanner Stream
		sc.close();
         		
    }
}
