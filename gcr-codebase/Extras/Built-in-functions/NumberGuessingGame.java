import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Method to generate a guess 
    public static int generateGuess(int low, int high) {

        //  middle value 
        int guess = low + (int)(Math.random() * (high - low + 1));
        return guess;
	}

    // Method to get feedback from the user
    public static String getUserFeedback(Scanner sc) {

        System.out.print("Is the guess high, low, or correct? ");
        return sc.nextLine();
    }

    // Method to update range based on user feedback
    public static int[] updateRange(int low, int high, int guess, String feedback){
        if (feedback.equalsIgnoreCase("high")) {
            high = guess - 1;
        }
        else if (feedback.equalsIgnoreCase("low")) {
            low = guess + 1;
        }
        // Return updated range
        return new int[]{low, high};
    }
	
	public static void main(String[] args) {
        // create a scanner class object
        Scanner sc = new Scanner(System.in);

        // Initial range 
        int low = 1;
        int high = 100;

        // Loop until the computer guesses correctly
        while (true) {

            // computer guess
            int guess = generateGuess(low, high);
            System.out.println("Computer guess: " + guess);

            // Get feedback from user
            String feedback = getUserFeedback(sc);

            // Check if guess is correct
            if(feedback.equalsIgnoreCase("correct")){
                System.out.println("Computer guessed the number correctly!");
                break;
            }

            // Update range based on feedback
            int[] newRange = updateRange(low, high, guess, feedback);
            low = newRange[0];
            high = newRange[1];
        }
        
		// close Scanner stream
        sc.close();
    }
}
