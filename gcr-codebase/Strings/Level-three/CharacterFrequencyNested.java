import java.util.Scanner;

public class CharacterFrequencyNested {

    // Method to find frequency using nested loops
    public static String[] findFrequency(String text) {

        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        // Nested loops to count frequency
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '0') continue;

            freq[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // 1D String array to store result
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        String[] result = findFrequency(text);

        System.out.println("\nCharacter Frequency:");
        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }
}
