import java.util.Scanner;

public class ValidAnagram {

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s, String t) {

        // If lengths are different, cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Frequency array for all ASCII characters
        int[] freq = new int[256];

        // Increase frequency for characters in first string
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // Decrease frequency for characters in second string
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i)]--;
        }

        // Check if all frequencies are zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        // Check and display result
        if (isAnagram(s, t)) {
            System.o
