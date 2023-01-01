class Solution {
    
    public void setZeroes(int[][] matrix) {
        
        ArrayList<int[]> list = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    list.add(new int[]{i,j});
                }
            }
        }
        
        for(int[] arr: list){
            setZero(matrix, arr[0], arr[1]);
        }
        
    }
    public void setZero(int[][] matrix, int a, int b){
        for(int i = 0; i < matrix.length; i++){
            matrix[i][b] = 0;
        }
        for(int i = 0; i < matrix[0].length; i++){
            matrix[a][i] = 0;
        }
    }
    
}