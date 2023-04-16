class Solution {
public:
    int mod = 1000000007;
    int dp[1001][1001];
    
    int solve(int i, vector<string> &words, int p, string &target){
        if(dp[i][p] != -1) return dp[i][p];
        
        if(p == target.size()) return 1;
        if(i >= words[0].size() || (words[0].size() - i) < (target.size() - p)) return 0;
        
        long long ans = 0;
        for(int j = 0; j < words.size(); j++){
            if(words[j][i] == target[p]){
                ans += solve(i+1, words, p+1, target); // selected
            }
        }
        
        ans += solve(i+1, words, p, target); // not selected    
        return dp[i][p] = ans%mod;
    }
    
    int numWays(vector<string>& words, string target) {
        memset(dp, -1, sizeof(dp));
        
        return solve(0, words, 0, target);
    }
};