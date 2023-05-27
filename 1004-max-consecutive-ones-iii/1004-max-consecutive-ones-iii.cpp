class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int n = nums.size(), start = 0, ans = 0;
        vector<int> freq(2);
        
        for(int end = 0; end < n; end++){
            // adding in window
            freq[nums[end]]++;
            
            // removing from window
            while(freq[0] > k){
                freq[nums[start]]--;
                start++;
            }
            
            // considering the valid window
            ans = max(ans, end - start + 1);
        }
        
        return ans;
    }
};