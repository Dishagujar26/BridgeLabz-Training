import java.util.Scanner;

// Create a PlayerHeight class to find the shortest, tallest, and mean height of players present in a football team
public class PlayerHeight{
    
	// method to generate random 3 digit height array 
	public static int[] genrateHeightArray(int []height){
	    for(int i=0; i<height.length; i++){
		    height[i] = (int)(Math.random() * 900) + 100;
		}
        return height;
	}
	
	// method to find the sum of all the elements present in the array.
	public static int sumOfHeight(int []height){
	    
		int sum = 0;
		for(int i=0; i<height.length; i++){
		   sum += height[i];
		}
        return sum;
	}
	
	// method to find  mean height of the players on the football team
	public static int meanHeight(int sum){
	    return (int) sum/11;
	}
	
	// method to find the shortest height of the players on the football team
	public static int findShortestHeight(int []height){
	    
		int shortest = height[0];
		for(int i=0; i<height.length; i++){
		  shortest = Math.min(shortest, height[i]);
		}
        return shortest;
	}
 	
	// method to find the tallest height of the players on the football team
	public static int findTallestHeight(int []height){
	    
		int tallest = height[0];
		for(int i=0; i<height.length; i++){
		  tallest = Math.max(tallest, height[i]);
		}
        return tallest;
	}

	public static void main(String []args){
	
	    // Create a Scanner object
	    Scanner sc = new Scanner(System.in);
	    
		int height[] = new int[11];
		PlayerHeight.genrateHeightArray(height);
		
		System.out.println("The mean height " + PlayerHeight.meanHeight(PlayerHeight.sumOfHeight(height)));
		System.out.println("The sum of height " + PlayerHeight.sumOfHeight(height));
		System.out.println("The shortest height " + PlayerHeight.findShortestHeight(height));
		System.out.println("The tallest height " + PlayerHeight.findTallestHeight(height));

		// close the scanner object
		sc.close();
	}
}
		
		