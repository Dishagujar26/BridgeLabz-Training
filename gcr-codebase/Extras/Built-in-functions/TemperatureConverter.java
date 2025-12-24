import java.util.Scanner;
// create TemperatureConverter class to convert temperature degree
public class TemperatureConverter {

    // Fahrenheit to Celsius conversion
    public static double fahrenheitToCelsius(double f) {
        return (f - 32)*5/9;
    }

    // Celsius to Fahrenheit conversion
    public static double celsiusToFahrenheit(double c) {
        return (c * 9/5)+32;
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter temperature in Fahrenheit:");
            double f = sc.nextDouble();
            System.out.println("Celsius: " + fahrenheitToCelsius(f));
        }
        else if (choice == 2) {
            System.out.println("Enter temperature in Celsius:");
            double c = sc.nextDouble();
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(c));
        }

        // close Scanner stream
        sc.close();
    }
}
