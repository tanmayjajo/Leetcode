class Solution {
public:
    void bfs(int r, int c, vector<vector<char>>& grid){
        if(r < 0 || c < 0 || r >= grid.size() || c >= grid[0].size()) return;
        if(grid[r][c] == '2' || grid[r][c] == '0') return;
        
        grid[r][c] = '2';
        
        
        bfs(r+1, c, grid);
        bfs(r, c+1, grid);
        bfs(r-1, c, grid);
        bfs(r, c-1, grid);
    }
    int numIslands(vector<vector<char>>& grid) {
        int r = grid.size();
        int c = grid[0].size();
        
        int count = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == '1'){
                    count++;
                    bfs(i, j, grid);
                }
            }
        }
        
        return count;
    }
};