class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else map.put(nums[i], 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> (b.getValue() - a.getValue()));
    
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            pq.add(entry);
        }
        
        int[] ans = new int[k];
        int i =0;
        while(k-->0){
            ans[i] = pq.poll().getKey();
            i++;
        }
        return ans;
    }
}