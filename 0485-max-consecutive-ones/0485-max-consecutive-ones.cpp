class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int n = nums.size(), ans = 0;
        
        for(int i = 0; i < n; i++){
            int count = 0;
            while(i < n && nums[i]==1){
                count++;
                i++;
            }
            ans = max(ans, count);
        }
        
        return ans;
    }
};