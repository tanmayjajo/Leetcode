class Solution {
public:
    int mod = 1e9+7;
    int dp[100005];
    
    int solve(int idx, string &s, int k){
        if(dp[idx] != -1) return dp[idx];
        
        if(idx == s.size()) return 1;
        if(s[idx] == '0') return 0;
        
        long long ans = 0;
        long long n = 0;
        for(int i = idx; i < s.size(); i++){    
            n = n*10 + s[i] - '0';
            if(n > k) break;
            ans += solve(i+1, s, k);
            ans = ans%mod;
        }
        return dp[idx] = ans;
    }
    
    int numberOfArrays(string s, int k) {
        memset(dp, -1, sizeof(dp));
        return solve(0, s, k);
    }
};