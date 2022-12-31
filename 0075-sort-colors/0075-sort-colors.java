class Solution {
    public void sortColors(int[] nums) {
        // tracker of zeroes
        int z = 0; 
    
        // tracker of twos
        int t = nums.length - 1; 
    
        // pointer for one traversal
        int p = 0;
    
    
        // here we are not keeping any pointer for tracking 1s because it will take care of itself
        while(p<=t){
            if(nums[p] == 0){
                swap(nums, z, p);
                if(nums[p] == 0) p++;
                z++;
            }else if(nums[p] == 2){
                swap(nums, t, p);
                t--;
            }else if(nums[p]==1){
                p++;
            }
        }
        
    }
    
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}