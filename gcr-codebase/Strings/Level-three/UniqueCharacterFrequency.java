import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find unique characters using charAt() and nested loops
    public static char[] uniqueCharacters(String text) {

        int length = text.length();
        char[] temp = new char[length];
        int count = 0;

        // Outer loop to pick each character
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            // Store unique character
            if (isUnique) {
                temp[count] = ch;
                count++;
            }
        }

        // Create exact size array for unique characters
        char[] uniqueChars = new char[count];
        for (int i = 0; i < count; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency using unique characters
    public static String[][] findFrequency(String text) {

        // ASCII frequency array
        int[] freq = new int[256];

        // Loop to find frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // 2D array to store character and frequency
        String[][] result = new String[uniqueChars.length][2];

        // Store unique characters and their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        String[][] frequency = findFrequency(text);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("----------------------");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i][0] + "\t\t" + frequency[i][1]);
        }

        sc.close();
    }
}
