class Solution {
    public int singleNumber(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int i = 0; i < nums.length; i++){
        //     if(!set.contains(nums[i])) set.add(nums[i]);
        //     else set.remove(nums[i]);
        // }
        // set.iterator()
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }else{
                // System.out.println(nums[i]);
                map.put(nums[i], 1);
            }
        }
        
        int ans = 0;
        // for(int elem: map.keySet()){
        //     if(elem==1){
        //         ans = 
        //     }
        // }
        
        for(int elem: map.keySet()){
            ans = elem;
        }
        return ans;
    }
}