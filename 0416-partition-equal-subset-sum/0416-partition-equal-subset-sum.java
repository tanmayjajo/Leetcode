class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int ele: nums){
            sum += ele;
        }
        if(sum%2 == 1) return false;
        sum = sum/2;
    
        int[][] dp = new int[nums.length+5][sum+5];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
    
        if(helper(nums, nums.length - 1, sum, dp) == sum) return true;
        return false;
    }
    
    public int helper(int[] nums, int i, int sum, int[][] dp){
        if(sum == 0) return 0;
        if(i==0) return 0;
        
        
        if(dp[i][sum] != -1) return dp[i][sum];
        
        if(nums[i] > sum){
            return dp[i][sum] = helper(nums, i-1, sum,dp);
        }
        
        return dp[i][sum] = Math.max(helper(nums, i-1, sum, dp), 
                                     helper(nums, i-1, sum-nums[i], dp) + nums[i]);
    }
}