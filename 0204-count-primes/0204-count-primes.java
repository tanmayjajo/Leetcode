class Solution {
     
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        
        if(n==0 || n == 1) return 0;
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i =2; i < n; i++){
            if(isPrime[i] == true){
                for(int j = 2*i; j < n; j += i){
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for(int i =0; i < n; i++){
            if(isPrime[i] == true) count++;
        }
        return count;
    }
}