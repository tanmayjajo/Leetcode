class Solution {
public:
    int dp[100005][2];
    int solve(int idx, vector<int> &prices, bool toBuy){
        if(idx == prices.size()) return 0;
        if(dp[idx][toBuy] != -1) return dp[idx][toBuy];
        if(toBuy){
            return dp[idx][toBuy] = max(-prices[idx] + solve(idx+1, prices, !toBuy),
                      solve(idx+1, prices, toBuy));
        }else{
            return dp[idx][toBuy] = max(prices[idx], solve(idx+1, prices, toBuy));
        }
    }
    
    int maxProfit(vector<int>& prices) {
        memset(dp, -1, sizeof(dp));
        return solve(0, prices, true);
    }
};