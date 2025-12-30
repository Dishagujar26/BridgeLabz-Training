/*
  7. The Number Guessing Game
  A game asks the player to guess a number between 1 and 100.
  Core Java Scenario Based Problem Statements
  Use do-while loop.
  Give hints like "Too high" or "Too low".
  Count attempts and exit after 5 wrong tries.
*/

import java.util.Scanner;

public class NumberGuessingGame {

    // Method to generate a guess 
    public static int computersNumber(int low, int high) {

        //  get random value in between the range 
        int actualNumber = low + (int)(Math.random() * (high - low + 1));
        return actualNumber;
	}

    // method to get feedback of from the computer
    public static String getComputerFeedback(int actualNumber, int guess) {
        if(actualNumber > guess){
			return "Too low";
		}
		else if(actualNumber < guess){
		    return "Too high";
		}
		else{
			return "Correct";
		}
    }

    // method to update range based on user feedback
    public static int[] updateRange(int low, int high, int guess, String feedback){
        
		// if high then substract
		if (feedback.equalsIgnoreCase("too high")) {
            high = guess - 1;
        }
		
		// if low then add
        else if (feedback.equalsIgnoreCase("too low")) {
            low = guess + 1;
        }
		
        // updated range for guessing
        return new int[]{low, high};
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        //initial range 
        int low = 1;
        int high = 100;
        int actualNumber = computersNumber(low,high);
		int count = 0;
		int guess;
		
		do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();

            // guide user to guess number within range
            if (guess<low || guess>high) {
                System.out.println("Please guess between " + low + " and " + high);
                continue;
            }

            count++;
			
			// get computer feedback 
            String feedback = getComputerFeedback(actualNumber, guess);

            if (feedback.equalsIgnoreCase("Correct")) {
                System.out.println("You guessed correctly in " + count + " attempts!");
                break;
            }

            System.out.println("Hint: " + feedback);
            int[] updatedRange = updateRange(low, high, guess, feedback);
            low = updatedRange[0];
            high = updatedRange[1];
            
			// guide user for updated range based on computer feedback
            System.out.println("New range: " + low + " to " + high);

        }while(count < 5);
		System.out.println("You have ran out of chances!\nThe actual number was "+ actualNumber);
	    
		//close the Scanner stream
		sc.close();
	}
}
