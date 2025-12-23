import java.util.Scanner;
// Create a LongestAndShortestString program to find the shortest and longest strings in a given text

public class LongestAndShortestString {

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

	
	// Method to create two dimensional array of string
	public static String[][] create2DArray(String []word){
	    String [][]result = new String[word.length][2];
		
		for(int i=0; i<word.length; i++){
		    result[i][0] = word[i];
			result[i][1] = String.valueOf(word[i].length());
		}
		return result;
	}
	
	// Method to find the shortest and longest number
	public static int[] findShortestLongest(String [][]result){
	    int shortest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		
		for(int i=0; i<result.length; i++){
		    if(Integer.parseInt(result[i][1]) < shortest){
			    shortest = Integer.parseInt(result[i][1]);
			}
			if(Integer.parseInt(result[i][1]) > largest){
			    largest = Integer.parseInt(result[i][1]);
			}
		}
		return new int[]{shortest, largest};
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();
		
        String[] word = LongestAndShortestString.splitWithoutMethod(text);

        String[][] Words2DArray = LongestAndShortestString.create2DArray(word);
		
		int[] result = LongestAndShortestString.findShortestLongest(Words2DArray);
		System.out.println("Shortest: "+ result[0] +" Longest: "+ result[1]);

        sc.close();
    }
}