class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        long actualTotalSum = 1l*n*(n+1)/2;
        long sumHere = 0;
        for(int i =0; i < nums.length; i++){
            sumHere += nums[i];
        }
        return (int)(actualTotalSum - sumHere);
    }
}