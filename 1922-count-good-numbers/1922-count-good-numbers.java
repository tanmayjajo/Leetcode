class Solution {
    public long M = 1000000007;
    public int countGoodNumbers(long n) {
        // if(n==1) return 5;
        
        long ans = (binExpo(4, n/2, M)%M * binExpo(5, n/2, M)%M)%M;
        
        if((n&1) == 1){
            return (int)((5*ans)%M);
        }
        return (int)(ans);
    }
    
    public long binExpo(long a, long b, long M){
        long ans = 1;
        
        while(b>0){
            if((b&1) != 0){
                ans = (ans * a)%M;
            }
            a = (a*a)%M;
            b >>= 1;
        }
        return ans%M;
    }
}