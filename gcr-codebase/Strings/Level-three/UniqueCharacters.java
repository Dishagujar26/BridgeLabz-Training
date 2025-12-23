import java.util.Scanner;

// class UniqueCharacters to Find unique characters in a string
public class UniqueCharacters {

    // Method to find length of string without using length()
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;
        }
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {

        int length = findLength(text);

        // store possible unique characters
        char[] temp = new char[length];
        int uniqueCount=0;

        for (int i = 0; i<length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j<i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // Store if unique
            if (isUnique) {
                temp[uniqueCount++] = current;
            }
        }

        // Create array for unique characters
        char[] result = new char[uniqueCount];
        for (int i=0; i<uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        char[] uniqueChars = UniqueCharacters.findUniqueCharacters(text);

        System.out.print("Unique characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
        
		// cose Scanner stream
        sc.close();
    }
}
