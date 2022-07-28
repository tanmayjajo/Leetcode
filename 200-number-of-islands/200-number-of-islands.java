class Solution {
    public int numIslands(char[][] grid) {
        
        int noOfIslands = 0;
        
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                
                if(grid[i][j] == '1'){
                    noOfIslands++;
                   
                    helper(grid, i, j);
                }
                
            }
        }
        
        return noOfIslands;
    }
    
    public void helper(char[][] grid, int a, int b){
        
        if( a == -1 || a == grid.length || b == -1 || b == grid[0].length || grid[a][b] != '1'){
            return;
        }
        
        grid[a][b] = '2';
    
        helper(grid, a+1, b);
        helper(grid, a, b+1);
        helper(grid, a-1, b);
        helper(grid, a, b-1);
        
    }
}