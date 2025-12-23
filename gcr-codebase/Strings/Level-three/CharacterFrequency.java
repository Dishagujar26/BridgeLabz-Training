import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters using charAt()
    public static String[][] findFrequency(String text) {

        // ASCII frequency array
        int[] freq = new int[256];

        // Loop to find frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }

        // 2D array to store characters and their frequencies
        String[][] result = new String[count][2];
        int index = 0;

        // Store characters and frequencies
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
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
