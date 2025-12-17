import java.util.Scanner;

// Creating class with name TemperatureConversion indicating the purpose is to convert temperature from Celsius to Fahrenheit.

public class TemperatureConversion {

    public static void main(String[] args) {

        // Create Scanner object sc to read input from keyboard
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");

        // Create a variable celsiusTemp and store value entered by user
        double celsiusTemp = sc.nextDouble();

        // Create a variable fahrenheitTemp and convert Celsius to Fahrenheit
        double fahrenheitTemp = (celsiusTemp * 9 / 5) + 32;

        // Display the converted temperature in Fahrenheit
        System.out.println("Temperature in Fahrenheit is: " + fahrenheitTemp);
    }
}
