// Create BMIProgram Class to compute BMI of a person 
import java.util.Scanner;

public class BMIProgram{  
	public static void main(String []args){
	    
		// Create a Scanner object 
        Scanner sc = new Scanner(System.in);
		
        // Get input value of weight        		
		double weight = sc.nextDouble();
		
        // Get input value of height        		
		double height = sc.nextDouble();
		
		// Convert height in meters
		double heightInMeter = height * 0.01;
		
	    double bmi =  weight / (heightInMeter * heightInMeter);
		
		if(bmi <= 18.4){
		    System.out.println("Underweight");
		}
		else if(bmi >= 18.5 && bmi <= 24.9){
		    System.out.println("Normal");
		}
		else if(bmi >= 25.0 && bmi <= 39.9){
		    System.out.println("Overweight");
		}
		else{
		    System.out.println("Obese");
		}
		
		// Closing the Scanner Stream
		sc.close();
         		
    }
}