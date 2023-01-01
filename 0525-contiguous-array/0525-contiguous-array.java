 class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length == 1) return 0;
        
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                sum++;
            }else{
                sum--;
            }
            
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }else{
                ans =  Math.max(ans,i - map.get(sum));
            }
            
        }
        if(map.size() == nums.length + 1) return 0;
        return ans;
    }
}