class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        helper(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    
    public void helper(int[][] image, int sr, int sc, int color, int k){
        if( image[sr][sc] == color) return;
        
        if(image[sr][sc] == k){
            image[sr][sc] = color;
        }else{
            return;
        }
        
        if(sr < image.length - 1) helper(image, sr + 1, sc, color, k);
        if(sr > 0) helper(image, sr - 1, sc, color, k);
        if(sc < image[0].length - 1) helper(image, sr, sc + 1, color, k);
        if(sc > 0) helper(image, sr, sc - 1, color, k);
        
    }
}