import java.util.Scanner;

// Create SmallestAmongThree Class to check if the first is the smallest of the 3 numbers
public class SmallestAmongThree{
    public static void main(String []args){
	    
		// Create a Scanner object 
	    Scanner sc = new Scanner(System.in);
		
		// Get three input value 
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		System.out.println("Is the first number the smallest? " + ((x < y ) && (x < z)));
		
		// Closing the Scanner Stream
		sc.close();
	}
	
}
			
		