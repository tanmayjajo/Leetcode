class Solution {
public:
    int dp[505][505];
    
    int solve(int l, int r, string &s){
        if(dp[l][r] != -1) return dp[l][r];
        
        if(l >= r) return 0;
        int ans = 1e8;
        if(s[l] == s[r]){
            ans = solve(l+1, r-1, s);
        }else{
            ans = min(ans, 1 + solve(l+1, r, s));
            ans = min(ans, 1 + solve(l, r-1, s));          
        }
        return dp[l][r] = ans;
    }
    
    int minInsertions(string s) {
        memset(dp, -1, sizeof(dp));
        return solve(0, s.size()-1, s);
    }
};