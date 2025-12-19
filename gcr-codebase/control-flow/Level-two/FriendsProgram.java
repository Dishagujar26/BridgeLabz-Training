// Create FriendsProgram Class to find tallest and youngest among three friend 

import java.util.Scanner;

public class FriendsProgram {
    public static void main(String[] args) {
		// Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Get three input value for height
        double amarHeight = sc.nextDouble();
        double akbarHeight = sc.nextDouble();
        double anthonyHeight = sc.nextDouble();
		
		// Get three input value for age
		int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();

        // Calculate the youngest friend (smallest age)
        if (amarAge < akbarAge && amarAge < anthonyAge){
            System.out.println("Amar is the youngest");
		}
        else if (akbarAge < amarAge && akbarAge < anthonyAge){
            System.out.println("Akbar is the youngest");
		}
        else{
            System.out.println("Anthony is the youngest");
		}
		
        // Calculate the tallest friend (largest height)
		if (amarHeight > akbarHeight && amarHeight > anthonyHeight){
            System.out.println("Amar is the tallest");
		}
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight){
            System.out.println("Akbar is the tallest");
		}
        else{
            System.out.println("Anthony is the tallest");
		}
		
		// Closing the Scanner Stream
		sc.close();
		
    }
}
