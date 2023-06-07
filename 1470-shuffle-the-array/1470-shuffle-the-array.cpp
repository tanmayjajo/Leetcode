class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        vector<int> ans(2*n);
        int s = 0, e = n;
        
        for(int i = 0; i < 2*n; i++){
            if(i%2 == 0){
                ans[i] = nums[s++];
            }else{
                ans[i] = nums[e++];
            }
        }
        
        return ans;
    }
};