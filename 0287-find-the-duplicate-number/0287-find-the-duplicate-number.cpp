class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        set<int> st;
        for(int i = 0; i < nums.size(); i++){
            if(st.count(nums[i]) == 0){
                st.insert(nums[i]);
            }else{
                return nums[i];
            }
        }
        return -1;
    }
};