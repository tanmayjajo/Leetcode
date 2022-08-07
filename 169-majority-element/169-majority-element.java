import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        
        int pointer = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(pointer==nums[i]){
                count++;
            } else{
                if(count==0){
                    pointer = nums[i];
                    count = 1;
                }else{
                    count--;
                }
                
            }
        }
        return pointer;
    }
}