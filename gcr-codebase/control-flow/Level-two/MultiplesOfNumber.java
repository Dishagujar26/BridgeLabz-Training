// Create MultiplesOfNumber class to print all the multiples of a number below 100
import java.util.Scanner;

public class MultiplesOfNumber{
    public static void main(String[] args){
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Get input value for number
        int number = sc.nextInt();

        // Check number is positive and less than 100
        if (number>0 && number<100){

            // Loop backward from 100 to 1	
            for (int i = 100; i >= 1; i--) {

                // Check if i is a multiple of number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } 

        // Close the Scanner Stream
        sc.close();
    }
}
