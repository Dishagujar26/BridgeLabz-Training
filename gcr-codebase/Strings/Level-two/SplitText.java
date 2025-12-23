import java.util.Scanner;
import java.util.Arrays;

public class SplitText {

    // Method to find length of string 
    public static int findLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } 
		catch (StringIndexOutOfBoundsException e) {
            return length;
        }
    }

    // Method to split text into words without using split()
    public static String[] splitWithoutMethod(String text) {
        int len = findLength(text);

        // Count words
        int wordCount = 0;
        if (len>0 && text.charAt(0)!=' ')
            wordCount++;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ' && i + 1 < len && text.charAt(i + 1) != ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount + 1];
        int index = 0;
        spaceIndex[index++] = -1;

        for (int i = 0; i<len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }
        spaceIndex[index] = len;

        // Extract words
        String[] words = new String[wordCount];
        for (int i = 0; i<wordCount; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                if (text.charAt(j) != ' ') {
                    word += text.charAt(j);
                }
            }
            words[i] = word;
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();
		
        String[] manual = splitWithoutMethod(text);

        String[] splitResult = text.split(" ");

        // Compare results
        boolean result = compareArrays(manual, splitResult);

        System.out.println("Manual Split Result: " + Arrays.toString(manual));
        System.out.println("Built-in Split Result: " + Arrays.toString(splitResult));
        System.out.println("Are both results same? " + result);
    }
}
