class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int n = nums.size(), start = 0, ans = 0;
        
        int len = 0;
        for(int end = 0; end < n; end++){
            // removing from window
            while(k == 0 && nums[end] == 0){
                if(nums[start] == 0) k++;
                len--;
                start++;
            }
            
            // adding in window
            if(nums[end] == 1){
                len++;
            }else if(nums[end] == 0 && k>0){
                k--;
                len++;
            }
            
            // considering the valid window
            ans = max(len, ans);
            
            
        }
        
        return ans;
    }
};