class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0]; 
        if(nums[0] < nums[nums.length - 1]) return nums[0];
        
        int s = 0;
        int e = nums.length - 1;
        int ans = 0;
        while(s<=e){
            int mid = s + (e-s)/2;
            
            if(nums[mid] < nums[nums.length - 1]){
                ans = nums[mid];
                e = mid-1;
            }else if(nums[mid] > nums[nums.length - 1]){
                s = mid + 1;
            }else{
                ans = nums[mid];
                e = mid - 1;
            }
        }
        return ans;
    }
}