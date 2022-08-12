class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(nums[i] + max, nums[i]);
            ans = Math.max(ans, max);
        }
        return ans;
    }
}