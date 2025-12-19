import java.util.Scanner;

// Create CheckAge Class to check whether a person can vote
public class CheckAge{
    public static void main(String []args){
	    
		// Create a Scanner object 
	    Scanner sc = new Scanner(System.in);
		
		// Get input value of age
		int age = sc.nextInt();
		
		// Check if age is greater then or equal to 18
		if(age >= 18){
			System.out.println("The person's age is " + age + " and can vote.");
		}
		else{
			System.out.println("The person's age is " + age + " and cannot vote.");
		}
		
		// Closing the Scanner Stream
		sc.close();
	}
	
}
			
		