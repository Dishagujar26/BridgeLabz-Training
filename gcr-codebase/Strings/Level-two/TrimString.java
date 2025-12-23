import java.util.Scanner;
// create a class TrimString to trim the leading and trailing spaces in a string 
public class TrimString {

    // Method to find start and end index after trimming spaces
    public static int[] trimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings 
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();


        int[] indexes = trimIndexes(text);
        String trimmedByUser = createSubstring(text, indexes[0], indexes[1]);

        
        String trimmedByMethod = text.trim();

        // Compare results
        boolean isSame = compareStrings(trimmedByUser, trimmedByMethod);

        System.out.println("Trimmed (User Method): [" + trimmedByUser + "]");
        System.out.println("Trimmed (Built-in):    [" + trimmedByMethod + "]");
        System.out.println("Are both same? " + isSame);

        sc.close();
    }
}
