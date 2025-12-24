import java.util.Scanner;
// AnagramCheck class to check if two strings are anagrams or not 
public class AnagramCheck {

    // Method to check whether two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {

        // If lengths are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] freq = new int[256];

        // create frequency array
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            freq[ch]++;
        }

        // Decrease frequency for characters in second string
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            freq[ch]--;
        }

        // Check if all frequencies are zero
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
	
	public static void main(String[] args) {
        // create a Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        // Check if strings are anagrams
        boolean result = areAnagrams(str1, str2);

        if (result) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are NOT anagrams");
        }

        // close the Scanner stream
        sc.close();
    }
}
