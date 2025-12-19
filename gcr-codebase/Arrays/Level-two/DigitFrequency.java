import java.util.Scanner;
// Create a DigitFrequency finds and displays how many times each digit appears in a given number using arrays

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get number as input
        int number = sc.nextInt();

        // variable to find digit count
        int temp = number;
        int count = 0;

        // Find the count of digits in the number
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        // Array to store digits of the number
        int[] digits = new int[count];
        temp = number;

        // Get digits and store them in the array
        for (int i=count - 1; i>=0; i--) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // Frequency array for digits 
        int[] frequency = new int[10];

        // Find frequency 
        for (int i = 0; i<digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i<frequency.length; i++) {
            if (frequency[i]>0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        // Close scanner
        sc.close();
    }
}
