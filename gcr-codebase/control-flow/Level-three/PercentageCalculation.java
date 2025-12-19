import java.util.Scanner;

// Create PercentageCalculation Class to compute percentage, grade and remarks of 3 subjects

public class PercentageCalculation{  
	public static void main(String []args){
	    
		// Create a Scanner object 
        Scanner sc = new Scanner(System.in);
		
		
        // Get input value for subjects    		
		int physics = sc.nextInt();
		int chemistry = sc.nextInt();
		int maths = sc.nextInt();
		
		// Calculate percentage
	    int percentage = (physics + chemistry + maths) / 3;
		
		// Check the percentage
	    if(percentage > 80){
            System.out.println("Grade: A \nRemarks: Level 4, above agency-normalized standards "+ "\nMarks: "+percentage+"%");
        }
        else if(percentage >= 70 && percentage <= 79){
        	
			System.out.println("Grade: B \nRemarks: Level 3, at agency-normalized standards "+ "\nMarks: "+percentage+"%");
	    }
		else if(percentage >= 60 && percentage <= 69){
        	
		    System.out.println("Grade: C \nRemarks: Level 2, below approaching agency-normalized standards "+ "\nMarks: "+percentage+"%");

	    }
		else if(percentage >= 50 && percentage <= 59){			
		    System.out.println("Grade: D \nRemarks: Level 1, well below agency-normalized standards "+ "\nMarks: "+percentage+"%");
	    }
		else if(percentage >= 40 && percentage <= 49){
		    System.out.println("Grade: E \nRemarks: Level 1-, too below agency-normalized standards "+ "\nMarks: "+percentage+"%");

	    }
		else{
		    
			System.out.println("Grade: R \nRemarks: Remedial standards "+ "\nMarks: "+percentage+"%");
		}
		
		
		// Closing the Scanner Stream
		sc.close();
         		
    }
}