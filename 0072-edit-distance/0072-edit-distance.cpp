class Solution {
int dp[505][505];
public:
    int solve(int i, int j, string &s, string &t){
        if(j == t.size()) return s.size() - i;
        if(i == s.size()) return t.size() - j;
        if(dp[i][j] != -1) return dp[i][j];
        int ans = 1e8;
        
        if(s[i] == t[j]){
            ans = min(ans, solve(i+1, j+1, s, t));
        }else{
            ans = min(ans, 1 + solve(i+1, j, s, t)); // deleted
            ans = min(ans, 1 + solve(i+1, j+1, s, t)); // replaced
            ans = min(ans, 1 + solve(i, j+1, s, t)); // inserted
        }
        return dp[i][j] = ans;
    }
    int minDistance(string word1, string word2) {
        memset(dp, -1, sizeof(dp));
        return solve(0, 0, word1, word2);
    }
};