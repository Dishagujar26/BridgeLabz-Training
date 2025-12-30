import java.util.Scanner;

public class SearchInsertPosition{

    // method to search the elemnet using binary search
    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;

        while(start <= end){
            //step 1 is to find the middle elemnet
            int mid=start + (end- start)/2;
            if(target<nums[mid] ){
                //in this case only the end will change not the start
                end=mid-1;

            }
			else if (target>nums[mid]) {
                //in this case only the start will change not the end
                start=mid+1;

            }
            else{
                //that is target and the middle value is same
                //search foud
                return mid ;

            }

        }
        return  start;
        
    }
	
	public static void main(String []args){
        Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();
	    int [] nums = new int[size];
	   
	    for(int i=0; i<size; i++){
	       nums[i] = sc.nextInt();
		}
		
		System.out.println("Enter number to be searched ");
		int target = sc.nextInt();
		System.out.println(SearchInsertPosition.searchInsert(nums, target));
	
	    sc.close();
	   
    }
}