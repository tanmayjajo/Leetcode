class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        for(int i =0; i < nums.length; i++){
            ans = ans^(i+1);
            ans = ans^nums[i];
        }
        return ans;
    }
}