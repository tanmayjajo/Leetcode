class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        // long a = map.size() - map.values().stream().filter(isEvenNumber).count(); // a is number of leftovers
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()%2 == 0){
                ans[0] = ans[0] + (entry.getValue())/2;
            }else{
                if(entry.getValue() != 1){
                    ans[0] = ans[0] + (entry.getValue()-1)/2;
                }
                ans[1]++;
                
            }
            // System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
             
        return ans;
    }
}