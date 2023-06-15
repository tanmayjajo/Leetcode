class Solution {
public:
    // will count no of subarrays with at max k odd numbers in it
    int count(vector<int> &nums, int k){
        if(k < 0) return 0;
        
        int count = 0;
        int l = 0;
        for(int r = 0; r < nums.size(); r++){
            if(nums[r]%2 == 1) k -= 1;
            
            while(k < 0){
                if(nums[l]%2 == 1){
                    k += 1;
                }
                l++;
            }
            count += r - l;
        }
        return count;
    }
    int numberOfSubarrays(vector<int>& nums, int k) {
        return count(nums, k) - count(nums, k-1);
    }
};