import java.util.Scanner;
// create a class SubstringOccurrences to count how many times a given substring occurs in a string.
public class SubstringOccurrences {

    // Method to count substring occurrences
    public static int countSubstringOccurrences(String text, String substring) {

        int count = 0;
        // Loop till the point where substring comparison is possible
        for (int i = 0; i <= text.length() - substring.length(); i++) {

            boolean isMatch = true;

            // Compare substring characters one by one
            for (int j = 0; j < substring.length(); j++) {

                // If any character does not match
                if (text.charAt(i + j) != substring.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }

            // If full substring matched
            if (isMatch) {
                count++;
            }
        }

        // Return total count
        return count;
    }
	
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String text = sc.nextLine();

        System.out.println("Enter the substring to search:");
        String sub = sc.nextLine();

        int count = countSubstringOccurrences(text, sub);

        System.out.println("Substring occurs " + count + " times");

        // close the Scanner object
        sc.close();
    }

}
