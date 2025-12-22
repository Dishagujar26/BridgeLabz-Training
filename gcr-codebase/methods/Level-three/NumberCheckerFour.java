import java.util.Scanner;

public class NumberCheckerFour {

    // Method to check if a number is a prime number
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }

        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number){
        int square = number * number;
        int sum = 0;

        while(square > 0){
            sum += square % 10;
            square /= 10;
        }

        return sum == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number){
        int sum = 0;
        int product = 1;

        while(number > 0){
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number){
        int square = number * number;
        int temp = number;

        while(temp > 0){
            if(temp % 10 != square % 10){
                return false;
            }
            temp /= 10;
            square /= 10;
        }

        return true;
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number){
        return (number % 7 == 0) || (number % 10 == 7);
    }

    public static void main(String[] args){

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println("Is Prime Number: " + NumberCheckerFour.isPrime(number));
        System.out.println("Is Neon Number: " + NumberCheckerFour.isNeonNumber(number));
        System.out.println("Is Spy Number: " + NumberCheckerFour.isSpyNumber(number));
        System.out.println("Is Automorphic Number: " + NumberCheckerFour.isAutomorphicNumber(number));
        System.out.println("Is Buzz Number: " + NumberCheckerFour.isBuzzNumber(number));

        // close the scanner object
        sc.close();
    }
}