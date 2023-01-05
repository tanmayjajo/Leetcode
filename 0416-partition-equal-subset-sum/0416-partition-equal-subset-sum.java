class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for(int i: nums){
            totalSum += i;
        }
        if((totalSum&1) == 1) return false;
        int Smax = totalSum/2;
        int[][] dp = new int[nums.length+5][Smax+5];
       
        Arrays.stream(dp).forEach(a-> Arrays.fill(a, -1));
        
        int ans = helper(nums, nums.length - 1, Smax, dp);
        
        if(ans == Smax){
            return true;
        }
        return false;
    }
    public int helper(int[] nums, int i, int Smax, int[][] dp){
        if(Smax==0)return 0;
        if(i < 0) return 0;
        
        if(dp[i][Smax] != -1){
            return dp[i][Smax];
        }
        
        if(nums[i] > Smax){
            return dp[i][Smax] = helper(nums, i-1, Smax, dp);
        }
        
        return dp[i][Smax] = Math.max(helper(nums, i-1, Smax-nums[i], dp) + nums[i], helper(nums, i-1, Smax, dp));
    }
}