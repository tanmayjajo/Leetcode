class Solution {
    public long M = 1000000007;
    
    long fact(int a){
        long ans = 1;
        for(int i = 1; i <= a; i++){
            ans = (int)((ans*i)%M);
        }
        return ans;
    }
    
    public int numberOfWays(int startPos, int endPos, int k) {
        
        long ans = 0;
        
        if ((startPos - endPos - k) % 2 != 0) return 0;
        if (Math.abs(startPos - endPos) > k) return 0;
       
        int hehe = Math.abs(endPos-startPos);
        int RightMoves = (k - hehe)/2 + hehe;
        int LeftMoves = (k-hehe)/2;
        
        // ans should be (k!)/(RightMoves)!*(LeftMoves)!
        
        ans = (int)fact(k);
        System.out.println(ans);
           
        // int denom = ((int)((fact(RightMoves)) * 1l * (int)(fact(LeftMoves)) + 5*M) %M );
        
        long denom = ((fact(RightMoves))%M * (fact(LeftMoves))%M)%M;
        
        // int denom = 
            
        System.out.println( "this is denom " + denom);
        // System.out.println(binExpIter(denom, M-2, M));
        
        
        ans = ((ans%M * (binExpIter(denom, M-2, M))%M)) %M;
        // ans = ans * binExpIter(denom, M-2, M);
        // ans = ans/denom;
     
        return (int)ans;
    }
    
    long binExpIter(long a, long b, long m){
        long ans = 1;
        while(b>0){
            if((b&1) == 1){
                ans = (ans*a)%m;
            }
            a = (a%m * a%m)%m;
            System.out.println(a);
            b >>= 1;
        }
        return ans;
    }
}