class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){
            int count = 0;
            int x = queries[i][0];
            int y = queries[i][1];
            int radius = queries[i][2];
            
            for(int j = 0; j < points.length; j++){
                if(dist(x, points[j][0], y, points[j][1]) <= radius){
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
    public double dist(int x1, int x2, int y1, int y2){
        int a = (x1-x2)*(x1-x2);
        int b = (y1-y2)*(y1-y2);
        
        return (Math.pow(a+b, 0.5));
    }
    
    
    
}