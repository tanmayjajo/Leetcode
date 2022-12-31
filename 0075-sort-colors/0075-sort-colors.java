class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length - 1; 
        int k = 0;
        while(k<=j){
            if(nums[k] == 0){
                swap(nums, i, k);
                if(nums[k] == 0) k++;
                i++;
            }else if(nums[k] == 2){
                swap(nums, j, k);
                j--;
            }else if(nums[k]==1){
                k++;
            }
        }
        
    }
    
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}