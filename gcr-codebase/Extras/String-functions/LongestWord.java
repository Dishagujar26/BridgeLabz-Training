import java.util.Scanner;
// Create a LongestWord class to find the longest word in the sentence.

public class LongestWord {

    // method to find longest word in string 
    public static String findLongestWord(String string){

	    String [] array = string.split(" ");
		int longestStringLength = Integer.MIN_VALUE;
		int longestStringIndex = -1;
		
		for(int i=0; i<array.length; i++){
		    if(array[i].length() > longestStringLength){
			    longestStringIndex = i;
			}
		}
        
		return array[longestStringIndex];
        
    }
			    
    public static void main(String[] args) {
	    
		// scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();
		
        System.out.println("Longest word in a string is "+ LongestWord.findLongestWord(text));

        // close Scanner stream
        sc.close();
    }
}