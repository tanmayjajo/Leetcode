class Solution {
public:
    int dp[201][201];
    int func(int r, int c, vector<vector<int>>& grid){
        if(r >= grid.size() || c >= grid[0].size()) return INT_MAX;
        
        if(dp[r][c] != -1)
            return dp[r][c];
        
        if(r == grid.size()-1 && c == grid[0].size()-1) 
            return dp[r][c] = grid[r][c];
        
        return dp[r][c] = grid[r][c] + min(func(r+1, c, grid), func(r, c+1, grid));
    }
    
    int minPathSum(vector<vector<int>>& grid) {
        memset(dp, -1, sizeof(dp));
        return func(0, 0, grid);
    }
};