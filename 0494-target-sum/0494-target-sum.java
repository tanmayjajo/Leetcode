class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        
        int[][] dp = new int[nums.length+5][2010];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        
        return helper(nums, target, 0, 0, 0, dp);
    }
    public int helper(int[] nums, int target, int i, int sum, int count, int[][] dp){
        if(i == nums.length && target == sum){
            count++;
            return count;
        }else if(i == nums.length){
            return count;
        }
        
        if(dp[i][sum + 1000] != -1) return dp[i][sum + 1000];
            
        return dp[i][sum + 1000] = helper(nums, target, i+1, sum - nums[i], count, dp)
            + helper(nums, target, i+1, sum + nums[i], count, dp);         
    }
}