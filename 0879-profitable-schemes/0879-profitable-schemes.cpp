class Solution {
public:
    int mod = 1e9+7;
    #define ll long long
    
    int dp[105][105][105];
    
    ll solve(int idx, int Profit, int minProfit, int men, vector<int> &group, vector<int> &profit){ 
        
        if(men < 0) return 0;
        
        if(idx == group.size()){    
            if(Profit >= minProfit) return 1;
            return 0;
        }
        
        if(dp[idx][Profit][men] != -1) return dp[idx][Profit][men];
        
        
        ll ans = solve(idx+1, min(minProfit, Profit+profit[idx]), minProfit, men - group[idx], group, profit);
        ans += solve(idx+1, Profit, minProfit, men, group, profit);
        
        return dp[idx][Profit][men] = ans%mod;
    }
    
    int profitableSchemes(int n, int minProfit, 
                          vector<int>& group, vector<int>& profit) {
        
        memset(dp, -1, sizeof(dp));
        return solve(0, 0, minProfit, n, group, profit);
    }
};