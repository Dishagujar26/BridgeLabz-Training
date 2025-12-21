import java.util.Scanner;

public class UnitConvertor {
   
    // Method to convert kilometers to miles
    public static double convertKmToMiles (double km){	    
		return km * 0.621371;
        
	}
	
	// Method to convert miles to kilometers
	public static double convertMilesToKilometers (double miles){	    
        return miles * 1.60934;		
        
	}
    
	// Method to convert meters to feet
	public static double convertMetersToFeets (double meters){	    
	    return meters * 3.28084;	
        
	}
	
	// Method to convert feet to meters
	public static double convertFeetsToMeters (double feet){	    
	    return feet * 0.3048;	
        
	}
	
    public static void main(String[] args) {
		// Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		// Get the input value 
		double value   = sc.nextDouble();
		
	    // Call ALL methods clearly
        System.out.println("Kilometers to Miles: " + UnitConvertor.convertKmToMiles(value));
        
		System.out.println("Miles to Kilometers: " + UnitConvertor.convertMilesToKilometers(value));
        
		System.out.println("Meters to Feet: " + UnitConvertor.convertMetersToFeets(value));
        
        System.out.println("Feet to Meters: " + UnitConvertor.convertFeetsToMeters(value));

        
        // Close the Scanner object
        sc.close(); 
	}   
     
}