class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, (a,b) -> Integer.compare(a[1], b[1]));
        
        PriorityQueue<int[]> pq = 
            new PriorityQueue<>(trips.length, (a,b) -> Integer.compare(a[2], b[2]));
        
        int sum = 0;
        int pos = 0;
        for(int i =0; i < trips.length; i++){
            pos = trips[i][1];
            pq.add(trips[i]);
            while(pq.peek()[2] <= pos){
                sum = sum-pq.poll()[0];
            }
            
            if(trips[i][0] > capacity - sum){
                return false;
            }else{
                sum += trips[i][0];
            }
            
        }
        
        return true;
    }
}