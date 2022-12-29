class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int l = 0;
        int r = nums.length - 1;
        
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                for(int i = mid; i < nums.length; i++){
                    if(nums[i] == target){
                        ans[1] = i;
                    }
                }
                for(int i = mid; i >= 0; i--){
                    if(nums[i] == target){
                        ans[0] = i;
                    }
                }
                break;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }
}