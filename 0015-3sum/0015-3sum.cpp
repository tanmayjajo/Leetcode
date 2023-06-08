class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<vector<int>> ans;
        set<vector<int>> st;
        
        for(int i = 0; i < nums.size(); i++){
            int s = i+1, e = nums.size()-1;
            while(s<e){
                if(nums[i] + nums[s] + nums[e] == 0){
                    vector<int> temp(3);
                    temp[0] = nums[i];
                    temp[1] = nums[s];
                    temp[2] = nums[e];
                    
                    sort(temp.begin(), temp.end());
                    st.insert(temp);
                    s++; e--;
                }else if(nums[i] + nums[s] + nums[e] < 0){
                    s++;
                }else{
                    e--;
                }
            }
        }
        
        for(auto i: st) ans.push_back(i);
        return ans;
    }
};