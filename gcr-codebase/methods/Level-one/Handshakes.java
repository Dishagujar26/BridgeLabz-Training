import java.util.Scanner;

// Create Handshakes Class to maximum number of handshakes among students.
public class Handshakes  {
   
    // Calculate maximum number of handshakes 
    public int calcualteMaxHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2 ;
    }
   
    public static void main(String[] args) {
		// Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
        Handshakes handshakes = new Handshakes();
	
	    // Take input for numberOfStudents
        int numberOfStudents  = sc.nextInt();
        
		// Get the calcualted maximum number of handshakes  
        int result = handshakes.calcualteMaxHandshakes(numberOfStudents);	
        System.out.println("The Calcualte maximum number of handshakes  " + result);
        
	    // Close the Scanner object
        sc.close(); 
	}
   
     
}
