class Solution {
     public int uniquePaths(int m, int n) {
        int a = 0;
        double numer = 1;
        double denom = 1;
        if(m < n){
            a = n;
            denom = fact(m-1);
        }else{
            a = m;
            denom = fact(n-1);
        }
        for(int i = a; i < m+n-1; i++){
            numer *= i;
        }
        
        return (int)(numer/denom);
    }
    public double fact(long a){
        if(a==0) return 1;
        return (a*fact(a-1));
    }
}