/*
 11. Temperature Logger 
 Record temperatures over 7 days.
 Use array and for-loop.
 Find average and max temperature.
 Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util. Scanner;

public class TemperatureLogger{
    public static void main(String[]args){
	    
		// Scanner for user input 
	    Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter the temperature of 7 days!");
        double []temperature = new double[7];
		
		// variable to track to store sum of temperature
		double sum = 0.0;
        
		// for loop to take user input for temprature
		for(int i=0; i<7; i++){
            System.out.println("Please enter the temprature of day "+ (i+1));
            temperature[i] = sc.nextDouble();
			sum += temperature[i];
        }	
		
		// variable to track maximum temperature
        double maxTemprature = temperature[0];
        		
	    // for loop to find the maximum temprature in 7 days 
		for(int i=0;i<7;i++){
		    if(temperature[i] > maxTemprature){
			    maxTemprature = temperature[i];
			}
		}
		
		// calculate average temprature
		double averageTemprature = sum/7;
		
		System.out.println("The Maximum Temperature is "+ maxTemprature);
		System.out.printf("The Average Temperature is %.2f%n", averageTemprature);
		
		//close the Scanner stream
		sc.close();
	}
}