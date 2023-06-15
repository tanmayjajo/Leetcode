class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int ans = INT_MIN;
        int prod = 1;

        for(int r = 0; r < nums.size(); r++){
            prod *= nums[r];
            ans = max(ans, prod);
            if(nums[r] == 0) prod = 1;
        }
        prod = 1;
        for(int r = nums.size()-1; r >= 0; r--){
            prod *= nums[r];
            ans = max(ans, prod);
            if(nums[r] == 0) prod = 1;
        }
        return ans;
    }
};