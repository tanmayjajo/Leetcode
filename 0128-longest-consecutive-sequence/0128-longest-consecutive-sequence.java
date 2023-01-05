class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
         
        int ans = 0;
        
        HashSet<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(a -> set.add(a));
         
        for(int i = 0; i < nums.length; i++){
            int count = 1;
            
            // left of the number
            int num = nums[i]; 
            while(set.contains(--num)){
                count++;   
                set.remove(num);
            }
            
            // right of the number
            num = nums[i];
            while(set.contains(++num)){
                count++;
                set.remove(num);
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}