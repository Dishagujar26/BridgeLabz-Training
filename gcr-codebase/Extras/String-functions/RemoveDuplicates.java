import java.util.Scanner;

// RemoveDuplicates class to remove duplicate character from the string 
public class RemoveDuplicates {

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String string) {

        // Boolean array to track already seen characters (ASCII characters)
        boolean[] visited = new boolean[256];
        StringBuilder result = new StringBuilder();

        // Loop through each character of the string
        for (int i = 0; i<string.length(); i++) {

            char ch = string.charAt(i);

            // If character is not visited yet
            if (!visited[ch]) {
                visited[ch] = true;
                result.append(ch);
            }
        }

        // Return the string
        return result.toString();
    }
	
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // method to remove duplicates
        String result = removeDuplicates(input);

        System.out.println("String after removing duplicates: " + result);
    }
}
