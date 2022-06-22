class Solution {
    public int search(int[] nums, int target) {
        return find(nums, target, 0, nums.length - 1);
    }
    public int find(int[] nums, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] >= nums[s]){
            if(target <= nums[mid] && target >= nums[s]){
                return find(nums, target, s, mid);
            }else{
                return find(nums, target, mid+1 , e);
            }
        } else if(target >= nums[mid] && target <= nums[e]){
            return find(nums, target, mid, e);
        }
        return find(nums, target, s, mid - 1);
    }
}