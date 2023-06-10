class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        
        int ans = 0;
        int l = 0;
        int flips = 0;
        
        for(int r = 0; r < nums.size(); r++){
            if(nums[r]==0){
                flips++;
            }
            while(flips>k){
                if(nums[l]==0) flips--;
                l++;
            }
            if(flips<=k) ans = max(ans, r-l+1);
        }
        return ans;
    }
};