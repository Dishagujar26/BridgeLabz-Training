import java.util.Scanner;

public class NumberCheckerTwo {

    // method to find the count of digits in the number 
    public static int findCount(int number){
        int count = 0;
        while(number > 0){
            count++;
            number /= 10;
        }
        return count;
    }

    // method to Store the digits of the number in a digits array
    public static int[] createDigitsArray(int number, int count){
        int[] digits = new int[count];

        for(int i = count - 1; i >= 0; i--){
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits using digits array
    public static int sumOfDigits(int[] digits){
        int sum = 0;
        for(int digit : digits){
            sum += digit;
        }
        return sum;
    }

    // method to find the sum of squares of digits 
    public static int sumOfSquares(int[] digits){
        int sum = 0;
        for(int digit : digits){
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number 
    public static boolean isHarshadNumber(int number, int[] digits){
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit using 2D array
    public static int[][] digitFrequency(int[] digits){
        int[][] freq = new int[10][2];

        // initialize first column with digits 0–9
        for(int i = 0; i < 10; i++){
            freq[i][0] = i;
        }

        // count frequency
        for(int digit : digits){
            freq[digit][1]++;
        }

        return freq;
    }

    public static void main(String[] args){

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int count = NumberCheckerTwo.findCount(number);
        System.out.println("Count of digits: " + count);

        int[] digits = NumberCheckerTwo.createDigitsArray(number, count);

        System.out.println("Sum of digits: " + NumberCheckerTwo.sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + NumberCheckerTwo.sumOfSquares(digits));
        System.out.println("Is Harshad number: " + NumberCheckerTwo.isHarshadNumber(number, digits));

        int[][] frequency = NumberCheckerTwo.digitFrequency(digits);

        System.out.println("Digit Frequency:");
        for(int i = 0; i < frequency.length; i++){
            if(frequency[i][1] > 0){
                System.out.println("Digit " + frequency[i][0] + " -- " + frequency[i][1]);
            }
        }

        // close the scanner object
        sc.close();
    }
}
