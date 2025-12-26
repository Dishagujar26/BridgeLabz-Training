import java.util.Scanner;

public class RemoveElement {

    // method to remove element
    public static int removeElement(int[] nums, int val) {
        int i = 0;

        for (final int num : nums){
            if (num != val)
                nums[i++] = num;
            
		}
        return i;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();
	    int [] nums = new int[size];
	   
	    for(int i=0; i<size; i++){
	       nums[i] = sc.nextInt();
		}
		
		System.out.println("Enter number to be removed");
		int val = sc.nextInt();
		int idx = RemoveElement.removeElement(nums, val);
		
		for(int i=0; i<idx; i++){
		    System.out.print(nums[i]+" ");    
		}
	   
	    sc.close();
	   
    }
}