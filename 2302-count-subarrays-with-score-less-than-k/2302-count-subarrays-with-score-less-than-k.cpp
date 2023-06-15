class Solution {
public:
    long long countSubarrays(vector<int>& nums, long long k) {
        int n = nums.size();
        
        long long score = 0, ans = 0;
        int l = 0;
        for(int r = 0; r < n; r++){
            if(l!=r) score /= r-l;
            score += nums[r];
            score *= r - l + 1;
    
            // cout << score << " " << r <<" " << l << endl;
            while(score >= k){
                score /= r - l + 1;
                score -= nums[l];
                l++;
                score *= r - l + 1;
                // cout << score << " " << r <<" " << l << endl;
            }
            
            ans += r - l + 1;
        }
        return ans;
    }
};