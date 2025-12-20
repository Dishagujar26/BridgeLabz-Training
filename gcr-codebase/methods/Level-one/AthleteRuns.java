import java.util.Scanner;

public class AthleteRuns  {
    // Create a Scanner object
    Scanner sc = new Scanner(System.in);
   
    // Calculate perimeter of a triangle 
    public int trianglePerimeter(int side1, int side2, int side3) {
        return side1 + side2 + side3;
    }
   
    // Calculate number of rounds 
    public double numberOfRounds(int perimeter, int distance) {
        return distance/perimeter;
    }
    
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
        AthleteRuns athleteRuns = new athleteRuns();
		
		int distance = 5000;
	
	    // Take three input
        int side1  = sc.nextInt();
		int side2  = sc.nextInt();
	    int side3  = sc.nextInt();
		
		// Get the calcualted perimeter of a triangle
        int perimeter = trianglePerimeter(side1,side2,side3);
		
		// Get the number of rounds
        double result = numberOfRounds(perimeter);
		
        System.out.println("The Calcualted number of rounds  " + result);
        
	    // Close the Scanner object
        sc.close(); 
    }
      
}
