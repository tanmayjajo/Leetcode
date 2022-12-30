class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int outBound = n-1;
        for(int x = 0; x < n/2; x++){
            for(int y = x; y < outBound; y++){
            
                int temp = matrix[y][x];
                matrix[y][x] = matrix[n - x - 1][y];
                matrix[n - x - 1][y] = matrix[n - y - 1][n - x - 1];
                matrix[n - y - 1][n - x - 1] = matrix[x][n - y - 1];
                matrix[x][n - y - 1] = temp;
            
            }
            outBound = outBound - 1;
        }
        
    }
}