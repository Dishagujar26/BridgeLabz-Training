import java.util.Scanner;
import java.util.Arrays;

public class TwoSum{
    
	// method to find two sum
    public int[] twoSum(int[] nums, int target) {

        int counti=0,countj=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    counti=i;
                    countj=j;
                }
            }
        }
        int[]ans={counti,countj};
        return ans;

    }
    public static void main(String []args){
        
		// create Scanner object
        Scanner sc=new Scanner (System.in);
        
        int a=sc.nextInt();
        int []nums=new int[a];
       
        int target=sc.nextInt();
       
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        TwoSum obj=new TwoSum();
        int []ans=obj.twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
		
		// close Scanner stream
		sc.close();

    }
}