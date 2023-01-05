class Solution {
    public boolean findSubarrays(int[] nums) {
        
        for(int i= 0; i < nums.length-1; i++){
            nums[i] = nums[i] + nums[i+1];
        }
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i= 0; i < nums.length-1; i++){
            if(set.contains(nums[i])) return true;
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}