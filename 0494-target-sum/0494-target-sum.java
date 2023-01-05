class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        
        int[][] dp = new int[nums.length+5][2010];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        
        return helper(nums, target, 0, 0, dp);
    }
    public int helper(int[] nums, int target, int i, int sum, int[][] dp){
        if(i == nums.length && target == sum){
            return 1;
        }else if(i == nums.length){
            return 0;
        }
        
        if(dp[i][sum + 1000] != -1) return dp[i][sum + 1000];
            
        return dp[i][sum + 1000] = helper(nums, target, i+1, sum - nums[i], dp)
            + helper(nums, target, i+1, sum + nums[i], dp);         
    }
}