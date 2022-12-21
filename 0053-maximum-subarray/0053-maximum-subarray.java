class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int bag = 0;
        for(int i =0; i < nums.length; i++){
            bag = bag + nums[i];
            if(bag>ans){
                ans = bag;
            }
            if(bag<0){
                bag = 0;
            }          
        }
        return ans;   
    }
}