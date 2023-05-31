class Solution {
public:
    void dfs(int r, int c, int prev, vector<vector<int>>& image, int color){
        if(r < 0 || c < 0 || r >= image.size() || c >= image[0].size()) return;
        if(image[r][c] == color || image[r][c] != prev) return;
        
        prev = image[r][c];
        image[r][c] = color;
        
        dfs(r+1, c, prev, image, color);
        dfs(r-1, c, prev, image, color);
        dfs(r, c+1, prev, image, color);
        dfs(r, c-1, prev, image, color);
    }
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color) {
        
        dfs(sr, sc, image[sr][sc], image, color);
        return image;
    }
};