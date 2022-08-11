import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        
        
        int val = nums[0];
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(count==0){
                val=nums[i];
            }
            
            if(nums[i] == val){
                count++;
            }else{
                count--;
            }
        }
        return val;
    }
}