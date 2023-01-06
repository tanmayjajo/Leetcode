class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr = new int[1001];
        
        for(int i =0; i < trips.length; i++){
            arr[trips[i][1]] += trips[i][0];
            arr[trips[i][2]] -= trips[i][0];
        }
        
        for(int i =0; i < arr.length; i++){
            capacity = capacity - arr[i];
            if(capacity < 0) return false;
        }
        return true;
    }
}