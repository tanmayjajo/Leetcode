class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, false);
        
        for(int i = 0; i < n; i++){
            arr[nums[i]] = true;
        }
        for(int i = 0; i < n+1; i++){
            if(!arr[i]) return i;
        }
        return -1;
    }
}