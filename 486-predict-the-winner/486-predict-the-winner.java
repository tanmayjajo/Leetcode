class Solution {
    public boolean PredictTheWinner(int[] nums) {
        
        int n = nums.length;
        int[][] dp = new int[n][n];
        
        for(int i = 0; i < n; i++){
            dp[i][i] = nums[i];
        }
        
        for(int K = 1; K < n; K++){
            for(int i = 0; i < n - K; i++){
                int j = i + K;
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
            }
        }
        return dp[0][n - 1] >= 0;
    }
    
}