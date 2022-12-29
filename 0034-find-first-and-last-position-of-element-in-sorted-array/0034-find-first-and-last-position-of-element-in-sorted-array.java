class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        if(nums.length == 0 || nums[0] > target) return ans;
        
        for(int i= 0; i < nums.length; i++){
            if(ans[0] == -1 && nums[i] == target){
                ans[0] = i;
                ans[1] = i;
            }
            if(nums[i] > target && nums[i-1] == target){
                ans[1] = i-1;
            }
        }
        if(nums[nums.length - 1] == target) ans[1] = nums.length - 1;
        return ans;
    }
}