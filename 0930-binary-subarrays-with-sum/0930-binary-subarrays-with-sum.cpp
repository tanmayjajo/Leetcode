class Solution {
public:
    int f(vector<int>& nums, int goal){
        if(goal < 0) return 0;
        
        int ans = 0;
        int left = 0;
        for(int right = 0; right < nums.size(); right++){
            goal -= nums[right];
            
            while(goal < 0){
                goal += nums[left];
                left++;
            }
            ans += right - left + 1;
        }
        
        return ans;
    }
    int numSubarraysWithSum(vector<int>& nums, int goal) {
        return f(nums, goal) - f(nums, goal-1);
    }
};