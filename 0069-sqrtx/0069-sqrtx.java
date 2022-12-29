class Solution {
    public int mySqrt(int x) {
        int l = 1;
        int r = x;
        
        int ans =0;
        
        while(l<=r){
            int mid = l + (r-l)/2;
            long prod = mid*1l*mid;
            
            if(prod== x){
                return mid;
            }else if(prod > x){
                r = mid - 1;
            }else{
                ans = mid;
                l = mid + 1;
            }
        }
        return ans;
    }
}