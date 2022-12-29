class Solution {
    public int arrangeCoins(int n) {
        long k = 0;
        long ans = 0;
        while(k*(k+1) <= 2*1l*n){
            ans = k;
            k++;
        }
        return (int)(ans);
    }
}