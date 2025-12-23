import java.util.Scanner;
// Create a VowelsAndConsonants2D program to store vowels and consonants in 2D array

public class VowelsAndConsonants2D {

    // method to check if a character is letter or not a letter 
    public static boolean isLetter(char ch){
        // check both uppercase and lowercase using ASCII
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            return true;
        }
        return false;
    }
	
    // check vowel and consonants
    public static String checkVowelAndConsonants(char ch){
        if(!isLetter(ch)) return "Not a Letter";

        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return "Vowel";
            default:
                return "Consonant";
        }
    }
	
    // Method to convert a character to lowercase using ASCII logic
    public static char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        return ch;
    }
	
    // check string 
    public static String[][] create2DArray(String string){
        String [][] string2DArray = new String[string.length()][2];
		for(int i=0;i<string.length(); i++){
			char ch = VowelsAndConsonants2D.toLower(string.charAt(i));
			string2DArray[i][0] = String.valueOf(ch);
			string2DArray[i][1] = VowelsAndConsonants2D.checkVowelAndConsonants(ch);
		}
		
		return string2DArray;
    }
			    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();
		
		String[][] result = VowelsAndConsonants2D.create2DArray(text);
		
        // Display in tabular format
		for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " --> " + result[i][1]);
        }

        sc.close();
    }
}