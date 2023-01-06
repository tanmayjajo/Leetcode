class Solution {

    int[] dp = new int[35];
    public int fib(int n) {
        Arrays.fill(dp, -1);
        return helper(n);
    }
    
    public int helper(int n){
        if(n<=1) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = fib(n-1) + fib(n-2);
    }
}