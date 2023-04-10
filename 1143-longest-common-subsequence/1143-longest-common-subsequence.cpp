class Solution {
int dp[1005][1005];

public:
    int solve(int idx1, int idx2, string &s1, string &s2){
        if(idx1 == s1.size() || idx2 == s2.size()) return 0;
        
        if(dp[idx1][idx2] != -1) return dp[idx1][idx2];
        
        int ans;
        if(s1[idx1] == s2[idx2]){
            ans = solve(idx1+1, idx2+1, s1, s2) + 1;
        }else{
            ans = solve(idx1+1, idx2, s1, s2);
            ans = max(solve(idx1, idx2+1, s1, s2), ans);
        }    
        return dp[idx1][idx2] = ans;
    }
    
    int longestCommonSubsequence(string text1, string text2) {
        memset(dp, -1, sizeof(dp));
        
        return solve(0, 0, text1, text2);
    }
};