class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int num = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(num!=nums[i]){
                num = nums[i];
                nums[j] = num;
                j++;
            }
        }
        return j;
    }
}