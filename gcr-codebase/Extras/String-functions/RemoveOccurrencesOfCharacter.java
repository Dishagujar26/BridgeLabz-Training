import java.util.Scanner;

// RemoveOccurrencesOfCharacter class to remove occurrences of a character in a string  
public class RemoveOccurrencesOfCharacter{

    // Method to remove occurrences of a character
    public static String remove(String text, char toRemovech) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<text.length(); i++) {
            char ch  = text.charAt(i);
            if(ch != toRemovech){
			    sb.append(ch);
			}
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();
		
		System.out.println("Enter character to be removed");
		char ch = sc.nextLine().charAt(0);

        System.out.println("Resultant String "+ remove(text,ch));
        
		// close scanner stream
        sc.close();
    }
}