class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        int a = 0;
        if(map.size() == 1){
            if(map.containsKey(0)){
                    a = 0;
            }else if(map.containsKey(1)){
                a = 1;
            }else{
                a = 2;
            }
            for(int i = 0; i < nums.length; i++){
                nums[i] = a;
            }
        }
        
        if(map.size() == 2){
            for(int i = 0; i < nums.length; i++){
                
                if(map.containsKey(0)){
                    if(map.containsKey(1)){
                        a = 0;
                        if( i >= map.get(0)) a = 1;
                    }else{
                        a = 0;
                        if( i >= map.get(0)) a = 2;
                    }
                }else{
                    a = 1;
                    if(i >= map.get(1)) a = 2;
                }
                
                nums[i] = a;
            }
        }
        if(map.size() == 3){
            for(int i = 0; i < nums.length; i++){
                if(i == map.get(0)) a = 1;
                if(i == map.get(1) + map.get(0)) a = 2;
                nums[i] = a;
            }
        }
        
    }
}