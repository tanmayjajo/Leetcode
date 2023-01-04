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
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1) return -1;
            
            count += (entry.getValue())/3;
            if(entry.getValue()%3 != 0) count++;
        }
            
        return count;
    }
}