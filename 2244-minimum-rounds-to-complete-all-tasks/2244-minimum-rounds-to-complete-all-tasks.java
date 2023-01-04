class Solution {
    public int minimumRounds(int[] tasks) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int t: tasks){
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        for(int value: map.values()){
            if(value == 1) return -1;
            
            count += (value)/3;
            if(value%3 != 0) count++;
        }
            
        return count;
    }
}