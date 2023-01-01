class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0) return;
        k = k % (nums.length);
        int[] arr = new int[nums.length];
        for(int i = k; i < nums.length; i++){
            arr[i] = nums[i-k];
        }
        for(int i = 0; i < k; i++){
            arr[i] = nums[nums.length + i - k];
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = arr[i];
        }
        
    }
}