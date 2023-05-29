class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int n = nums.size();
        int ans = 0;
        int ones = 0; // will decrement when zero is found
        
        vector<int> v(n+1);
        
        for(int i = 0; i < n; i++){
            if(nums[i] == 1) ones++;
            if(nums[i] == 0) ones--;
            v[i+1] = ones;
        }
        
        unordered_map<int, int> m;
        for(int i = 0; i <= n; i++){
            if(m.count(v[i])){
                ans = max(ans, i - m[v[i]]);
            }else{
                m[v[i]] = i;
            }
        }
        
        return ans;
    }
};