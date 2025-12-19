// Create PowerOfNumber class to find the power of a number.
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Get input value for number and power
        int number = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;

        // Loop from 1 to power to calculate result
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        System.out.println(result);

        // Close the Scanner Stream
        sc.close();
    }
}


