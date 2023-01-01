class Solution {
    public int[] closestPrimes(int left, int right) {
        
        boolean[] isPrime = new boolean[right+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i = 2; i*i < right+1; i++){
            if(isPrime[i]){
                for(int j = 2*i; j < right + 1; j=j+i){
                    isPrime[j] = false;
                }
            }
        }
        // System.out.println(Arrays.toString(isPrime));
        
        int j = -1;
        int[] ans = new int[2];
        Arrays.fill(ans, -1);
        int minVal = Integer.MAX_VALUE;
        
        for(int i = left; i < right+1; i++){
            
            if(isPrime[i]){
                if(j==-1) j = i; 
                
                if( i-j != 0 && i - j < minVal){
                    minVal = i - j;
                    ans[0] = j;
                    ans[1] = i;
                }
                
                j = i;
            }
        }
        return ans;
    }
}