class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        double xCopy = x;
        boolean isNeg = false;
        boolean isMax = false;
        if(n==0) return 1;
        if(n<0) {
            isNeg = true;
            if(n==Integer.MIN_VALUE){
                isMax = true;
                n = Integer.MAX_VALUE;
            }else{
                n = (-1)*n;
            }
            
        }
        
    
        while(n>0){
            if(n%2==1){
                ans = ans*x;
            }
            n = n >> 1;
            x = x*x;
        }
        if(isMax) return 1/(ans*xCopy);
        if(isNeg) return 1/ans;
        return ans;
    }
}