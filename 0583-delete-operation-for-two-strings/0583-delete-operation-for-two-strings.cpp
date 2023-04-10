class Solution {
int dp[505][505];
public:
    int lcs(int i, int j, string &s1, string &s2){
        if(i == s1.size() || j == s2.size()) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        int ans = 0;
        if(s1[i] == s2[j]){
            ans = 1 + lcs(i+1, j+1, s1, s2);
        }
        ans = max(ans, lcs(i+1, j, s1, s2));
        ans = max(ans, lcs(i, j+1, s1, s2));
        
        return dp[i][j] = ans;
    }
    
    int minDistance(string word1, string word2) {
        memset(dp, -1, sizeof(dp));
        
        int lcsLen = lcs(0, 0, word1, word2);
        
        int a = word1.size() - lcsLen;
        int b = word2.size() - lcsLen;
        return a + b;
    }
};