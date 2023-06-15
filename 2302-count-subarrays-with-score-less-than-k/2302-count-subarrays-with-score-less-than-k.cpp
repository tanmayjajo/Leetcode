class Solution {
public:
    long long countSubarrays(vector<int>& nums, long long k) {
        int n = nums.size();
        
        long long sum = 0, ans = 0;
        int l = 0;
        for(int r = 0; r < n; r++){
            sum += nums[r];

            // cout << score << " " << r <<" " << l << endl;
            while(sum *(r - l + 1) >= k){
                sum -= nums[l++];
                // cout << score << " " << r <<" " << l << endl;
            }
            
            ans += r - l + 1;
        }
        return ans;
    }
};