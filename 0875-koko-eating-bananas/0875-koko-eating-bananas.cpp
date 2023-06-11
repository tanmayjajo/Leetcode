class Solution {
public:
    int check(int k, vector<int>& piles, int h){
        for(int i = 0; i < piles.size(); i++){
            if(piles[i]%k==0){
                h -= piles[i]/k;
            }else{
                h -= 1+piles[i]/k;
            }
            if(h<0) return false;
        }
        return (h>=0);
    }
    int minEatingSpeed(vector<int>& piles, int h) {
        int minK = 1;
        int maxK = INT_MAX;

        int ans = maxK;        
        while(minK <= maxK){
            int mid = minK + (maxK - minK)/2;
            
            if(check(mid, piles, h)){
                ans = mid;
                maxK = mid-1;
            }else{
                minK = mid+1;
            }
        }
        return ans;
    }
};