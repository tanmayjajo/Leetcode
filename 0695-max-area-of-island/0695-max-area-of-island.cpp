class Solution {
public:
    int maxArea = 0;
    
    void bfs(int r, int c, int &area, vector<vector<int>>& grid){
        if(r < 0 || c < 0 || r >= grid.size() || c >= grid[0].size()) return;
        if(grid[r][c] == 0 || grid[r][c] == 2) return;
            
        grid[r][c] = 2;
        
        area++;
        bfs(r+1, c, area , grid);
        bfs(r-1, c, area , grid);
        bfs(r, c+1, area , grid);
        bfs(r, c-1, area , grid);
        
        
        maxArea = max(area, maxArea);
    }
    
    
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int r = grid.size();
        int c = grid[0].size();
        
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == 1){
                    int area = 0;
                    bfs(i, j, area, grid);
                }
            }
        }
        return maxArea;
    }
};