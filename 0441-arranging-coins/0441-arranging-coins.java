class Solution {
    
    // This problem can be reduced down to:
    // (K * (K+1))/2 <= N
    // K^2 + K <= 2*N
    // (K + 1/2)^2 <= 2*N + 1/4
    // K <= sqrt(2*N + 1/4) - 1/2
    
    public int arrangeCoins(int n) {
       return (int)(Math.sqrt(2* (long)n + 0.25) - 0.5 );
    }
}