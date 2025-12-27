//https://leetcode.com/problems/move-zeroes/description/
//Problem: 283

public class MoveZeroes{
    public void moveZeroes(int[] nums) {
        int numIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[numIndex] = nums[i];
                numIndex++ ;
            }
        }
         for(int i=numIndex ; i<nums.length ; i++){
            nums[i] = 0;
         }
        
    }
}