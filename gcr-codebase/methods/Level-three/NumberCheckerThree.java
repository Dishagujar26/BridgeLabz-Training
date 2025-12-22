import java.util.Scanner;

public class NumberCheckerThree {

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

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits){
        int[] reversed = new int[digits.length];

        for(int i = 0; i < digits.length; i++){
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome 
    public static boolean isPalindrome(int[] digits){
        int[] reversed = reverseDigitsArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check if a number is a duck number 
    public static boolean isDuckNumber(int[] digits){
        // zero should not be the first digit
        for(int i = 1; i < digits.length; i++){
            if(digits[i] == 0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int count = NumberCheckerThree.findCount(number);
        System.out.println("Count of digits: " + count);

        int[] digits = NumberCheckerThree.createDigitsArray(number, count);

        int[] reversedDigits = NumberCheckerThree.reverseDigitsArray(digits);

        System.out.println("Is Palindrome: " + NumberCheckerThree.isPalindrome(digits));
        System.out.println("Is Duck Number: " + NumberCheckerThree.isDuckNumber(digits));

        System.out.print("Original Digits: ");
        for(int d : digits){
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.print("Reversed Digits: ");
        for(int d : reversedDigits){
            System.out.print(d + " ");
        }

        // close the scanner object
        sc.close();
    }
}
