class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = firstOcc(nums, target);
        ans[1] = lastOcc(nums, target);
        return ans;
    }
    
    public int firstOcc(int[] nums, int target){
        int s = 0;
        int e = nums.length - 1;
        
        int res = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                res = mid;
                e = mid -1;
            }else if(nums[mid] > target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return res;
    }
    public int lastOcc(int[] nums, int target){
        int s = 0;
        int e = nums.length - 1;
        
        int res = -1;
        while(s<=e){
            
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                res = mid;
                s = mid + 1;
            }else if(nums[mid] > target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return res;
    }
}