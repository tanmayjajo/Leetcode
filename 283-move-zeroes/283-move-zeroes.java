class Solution {
    
    // use two pointers, whenever you find a non zero number then swap it with current pointer and increment the pointer.
    // this way all the non zeroes will be at the starting and zeroes will go to the end automatically in one traversal
    public void moveZeroes(int[] nums) {
        
        int i = 0;
        
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                swap(i, j, nums);
                i++;
            }
        }
    }
    
    public void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
}