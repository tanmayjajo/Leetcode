class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = 
            new PriorityQueue<Integer>(Collections.reverseOrder()); // max heap 
        
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                pq.add(matrix[i][j]);
    
                while(pq.size() > k){
                    pq.poll();
                }
            
            }
        }
        
        return pq.peek();
    }
}