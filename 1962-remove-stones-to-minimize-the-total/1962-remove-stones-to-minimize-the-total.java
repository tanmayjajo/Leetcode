class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0; i < piles.length; i++){
            pq.add(piles[i]);
        }
 
        for(int i = 0; i < k; i++){
            int val = pq.poll();
            pq.add(val - val/2);
        }
 
        
        int sum = 0;
        Iterator<Integer> itr = pq.iterator();
        while (itr.hasNext()){
            sum += itr.next();
        }
        return sum;
    }
}