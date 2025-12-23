import java.util.Scanner;
// Create a VowelsAndConsonants program to find total count of vowels and consonants

public class VowelsAndConsonants {

    // method to check if a character is letter or not a letter 
    public static boolean isLetter(char ch){
        // check both uppercase and lowercase using ASCII
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            return true;
        }
        return false;
    }
	
    // check vowel and consonants
    public static boolean checkVowelAndConsonants(char ch){
        if(!isLetter(ch)) return false;

        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
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
    public static int[] findCountOfVowelsConstants(String string){
        int vowelCount = 0;
        int consonantsCount = 0;
		
        for(char e : string.toCharArray()){
            char ch = toLower(e);

            if(checkVowelAndConsonants(ch)){
                vowelCount++;
            }
            else if(isLetter(ch)){
                consonantsCount++;
            }
        }
        return new int[]{vowelCount, consonantsCount};
    }
			    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();
		
        int[] result = VowelsAndConsonants.findCountOfVowelsConstants(text);
        System.out.println("Vowels Count: "+ result[0] +" Consonants Count: "+ result[1]);

        sc.close();
    }
}
