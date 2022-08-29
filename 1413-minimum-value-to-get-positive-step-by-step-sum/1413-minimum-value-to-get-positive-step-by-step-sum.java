class Solution {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = nums[i] + sum;
            min = Math.min(sum, min);
        }
        if(min > 0) return 1;
        return Math.abs(min) + 1;
    }
}