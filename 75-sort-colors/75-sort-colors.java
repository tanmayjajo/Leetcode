class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // using a hashmap for storing the frequency of 0s, 1s, 2s
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        // one iteration and hashmap filled!
        
        int a = 0; // number to be inserted in nums[i] 
        
        // handling all cases separately to avoid conflicts when any color is absent
        if(map.size() == 1){
            if(map.containsKey(0)){ // confirms only 0s are there
                    a = 0;
            }else if(map.containsKey(1)){ // confirms only 1s are there
                a = 1;
            }else{ // confirms only 2s are there
                a = 2; 
            }
            for(int i = 0; i < nums.length; i++){
                nums[i] = a; // filled peacefully
            }
        }
        
        if(map.size() == 2){
            for(int i = 0; i < nums.length; i++){
                
                if(map.containsKey(0)){
                    if(map.containsKey(1)){ // confirms that we have only 0s and 1s
                        a = 0;
                        if( i >= map.get(0)) a = 1;
                    }else{ // confirms that we have only 0s and 2s
                        a = 0;
                        if( i >= map.get(0)) a = 2;
                    }
                }else{ // confirms that we have only 1s and 2s
                    a = 1;
                    if(i >= map.get(1)) a = 2;
                }
                
                nums[i] = a; // filled peacefully
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