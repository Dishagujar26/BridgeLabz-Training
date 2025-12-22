import java.util.Scanner;

public class NumberCheckerFive {

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number){
        if(number <= 1){
            return false;
        }

        int sum = 0;
        for(int i = 1; i <= number / 2; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number){
        if(number <= 1){
            return false;
        }

        int sum = 0;
        for(int i = 1; i <= number / 2; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number){
        if(number <= 1){
            return true;
        }

        int sum = 0;
        for(int i = 1; i <= number / 2; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number){
        int temp = number;
        int sum = 0;

        while(temp > 0){
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    // Method to find factorial of a digit
    public static int factorial(int digit){
        int fact = 1;
        for(int i = 1; i <= digit; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args){

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println("Is Perfect Number: " + NumberCheckerFive.isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + NumberCheckerFive.isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + NumberCheckerFive.isDeficientNumber(number));
        System.out.println("Is Strong Number: " + NumberCheckerFive.isStrongNumber(number));

        // close the scanner object
        sc.close();
    }
}
