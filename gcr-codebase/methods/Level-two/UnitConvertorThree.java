import java.util.Scanner;

public class UnitConvertorThree {

    // Method to convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input value
        double value = sc.nextDouble();

        // Call all UnitConvertorThree methods
        System.out.println("Fahrenheit to Celsius: " + convertFarhenheitToCelsius(value));
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFarhenheit(value));
        
		System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(value));
        
		System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(value));
        
		System.out.println("Gallons to Liters: " + convertGallonsToLiters(value));
        
		System.out.println("Liters to Gallons: " + convertLitersToGallons(value));

        // Close Scanner object
        sc.close();
    }
}
