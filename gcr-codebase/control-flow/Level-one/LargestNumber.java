import java.util.Scanner;

// Create LargestNumber Class to compute the largest number
public class LargestNumber{
    public static void main(String []args){
	    
		// Create a Scanner object 
	    Scanner sc = new Scanner(System.in);
		
		// Get three input value 
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		System.out.println("Is the first number the largest? " + ((x > y ) && (x > z)));
		
		System.out.println("Is the second number the largest? " + ((y > x ) && (y > z)));
		
		System.out.println("Is the third number the largest? " + ((z > x ) && (z > y)));
		
		// Closing the Scanner Stream
		sc.close();
	}
	
}
			
		