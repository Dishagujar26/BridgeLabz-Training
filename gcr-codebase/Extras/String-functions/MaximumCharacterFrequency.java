import java.util.Scanner;

// MaximumCharacterFrequency class to count the maximum frequency of character in the string 
public class MaximumCharacterFrequency{

    // Method to find frequency of characters
    public static int[] findFrequency(String text) {

        int[] freq = new int[256];

        // Loop to find frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        return freq;
    }

    // Method to find the maximum frequency character
    public static char findMaximumFrequencyCharacter(int[] freq) {

        int maxFreq = 0;      
        char maxChar = ' ';  

        // Loop through frequency array
        for (int i = 0; i<freq.length; i++) {

            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char) i;
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        int[] freq = findFrequency(text);
        char result = findMaximumFrequencyCharacter(freq);

        System.out.println("Maximum frequency character: " + result);
        
		// close scanner stream
        sc.close();
    }
}
