class Solution {
    public int reverse(int x) {
        long ans = 0;
        boolean isNeg = false;
        if(x<0) {
            x = x*(-1);
            isNeg = true;
        }
        while(x>0){
            ans *= 10;
            ans += x%10;
            x = x/10;
        }
        if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE){
            return 0;
        }
    
        if(isNeg) return (int)(ans*(-1));
        return (int)(ans);
    }
}