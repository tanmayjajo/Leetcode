class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        int n = candies.size();
        vector<bool> ans(n);
        for(int i = 0; i < n; i++){
            candies[i] += extraCandies;
            if(candies[i] == *max_element(candies.begin(), candies.end())){
                ans[i] = true;
            }else{
                ans[i] = false;
            }
            
            candies[i] -= extraCandies;
        }
        return ans;
    }
};