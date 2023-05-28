class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        long long prod = 1;
        int zeroes = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0) prod *= nums[i];
            if(nums[i] == 0) zeroes++;
        }
        vector<int> ans(n, 0);
        if(zeroes == 0){
            for(int i = 0; i < n; i++){
                ans[i] = prod/nums[i];
            }
        }else if(zeroes == 1){
            for(int i = 0; i < n; i++){
                if(nums[i] == 0){
                    ans[i] = prod;
                    return ans;
                }
            }
        }else if(zeroes > 1) {
            return ans;
        }
        
        return ans;
    }
};