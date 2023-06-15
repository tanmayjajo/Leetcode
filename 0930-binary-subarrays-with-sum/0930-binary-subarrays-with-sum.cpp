class Solution {
public:
    // will give me count of all subarrays with sum 
    // less than equal to Goal
    
    int count(vector<int>& nums, int goal){
        if(goal < 0) return 0;
        int n = nums.size();
        int l = 0, r = 0;
        int count = 0;
        
        for(int r = 0; r < n; r++){
            goal -= nums[r];
            
            while(goal < 0){
                goal += nums[l];
                l++;
            }
            count += r-l+1;
        }
        return count;
    }
    
    int numSubarraysWithSum(vector<int>& nums, int goal) {
        return count(nums, goal) - count(nums, goal-1);
    }
};