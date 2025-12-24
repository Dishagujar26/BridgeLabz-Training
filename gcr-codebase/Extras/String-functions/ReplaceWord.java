import java.util.Scanner;
// create a class ReplaceWord that replaces a given word with another word in a sentence
public class ReplaceWord {

    // Method to count substring occurrences
    public static String replace(String string, String wordReplace, String word){

        String [] array = string.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<array.length;i++){
		    if(array[i].equals(wordReplace)){
			    sb.append(word).append(" ");
			}
			else{
			    sb.append(array[i]).append(" ");
            }
		}
			
        return sb.toString();
    }
	
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String text = sc.nextLine();
		
		System.out.println("Enter the word to be replaced:");
        String wordReplace = sc.nextLine();
		
		System.out.println("Enter the word to replace with:");
        String word = sc.nextLine();

        System.out.println("Replace String " + ReplaceWord.replace(text,wordReplace,word));

        // close the Scanner object
        sc.close();
    }

}