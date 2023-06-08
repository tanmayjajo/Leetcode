class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        sort(nums.begin(), nums.end());
        
        vector<vector<int>> ans;
        int n = nums.size();
        
        for(int i = 0; i < n-3; i++){
            for(int j = i+1; j < n; j++){
                long long target2 = target*1ll - nums[i]*1ll - nums[j]*1ll;
                
                int k = j+1, l = n-1;
                
                while(k < l){
                    if(nums[k]*1ll + nums[l]*1ll == target2*1ll){
                        vector<int> temp{nums[i], nums[j], nums[k], nums[l]};
                        ans.push_back(temp);
                        
                        while(k < l && nums[k] == temp[2]) k++;
                        while(k < l && nums[l] == temp[3]) l--;
                        
                    }else if(nums[k]*1ll + nums[l]*1ll < target2*1ll){
                        k++;
                    }else{
                        l--;
                    }
                }
                while(j+1 < n && nums[j+1] == nums[j]) j++;
            }
            while(i+1 < n && nums[i+1] == nums[i]) i++;
        }
        
        return ans;
    }
};