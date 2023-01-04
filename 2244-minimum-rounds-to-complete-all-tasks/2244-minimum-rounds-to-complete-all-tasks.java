class Solution {
    public int minimumRounds(int[] tasks) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < tasks.length; i++){
            if(!map.containsKey(tasks[i])){
                map.put(tasks[i], 1);
            }else{
                map.put(tasks[i], map.get(tasks[i]) + 1);
            }
        }
        if(map.values().contains(1)) return -1;
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            count += (entry.getValue() + 2)/3;
        }
            
        return count;
    }
}