import java.util.Scanner;

// Create Chocolates Class print the number of chocolates each child will get and remaining
public class WindChillTemperature{
   
    // Calculate wind chill temprature
    public double calculateWindChill(double temperature, double windSpeed) {	
       
	    double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75)* Math.pow(windSpeed,0.16);
		
		return windChill;
	}
	
    public static void main(String[] args) {
		// Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		// Get the input value
		double temperature  = sc.nextDouble();
		double windSpeed = sc.nextDouble();
	   
	    WindChillTemperature windChillTemperature = new WindChillTemperature();
		
		// Call the method
		double result  = windChillTemperature.calculateWindChill(temperature,windSpeed);
        System.out.println(" Wind Chill is "+ result);
        
        // Close the Scanner object
        sc.close(); 
	}   
     
}