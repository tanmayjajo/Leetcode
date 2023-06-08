class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<vector<int>> ans;
        
        for(int i = 0; i < nums.size(); i++){
            int s = i+1, e = nums.size()-1;
            
            while(s<e){
                if(nums[i] + nums[s] + nums[e] == 0){
                    vector<int> temp{nums[i], nums[s], nums[e]};
                    ans.push_back(temp);
                    
                    while(s < e && nums[s] == temp[1]) s++;
                    
                    while(s < e && nums[e] == temp[2]) e--;
                }else if(nums[i] + nums[s] + nums[e] < 0){
                    s++;
                }else{
                    e--;
                }
            }
            while(i+1 < nums.size() && nums[i] == nums[i+1]) i++;
        }
        
        return ans;
    }
};