class Solution {
    public int search(int[] nums, int target) {
        int minIdx = findMinEleIdx(nums);
        if(nums[minIdx] == target) return minIdx;
        
        int ans1 = binSearch(nums, target, 0, minIdx-1);
        int ans2 = binSearch(nums, target, minIdx + 1, nums.length - 1);
        
        
        if(ans1==-1){
            return ans2;
        }
        return ans1;
    }
    public int findMinEleIdx(int[] nums) {
        if(nums.length == 1) return 0; 
        if(nums[0] < nums[nums.length - 1]) return 0;
        
        int s = 0;
        int e = nums.length - 1;
        int ans = 0;
        while(s<=e){
            int mid = s + (e-s)/2;
            
            if(nums[mid] < nums[nums.length - 1]){
                ans = mid;
                e = mid-1;
            }else if(nums[mid] > nums[nums.length - 1]){
                s = mid + 1;
            }else{
                ans = mid;
                e = mid - 1;
            }
        }
        return ans;
    }
    
    public int binSearch(int[] nums, int target, int s, int e){
        if(nums.length == 1){
            if(nums[0] == target) return 0;
            else return -1;
        }
        int mid = s + (e-s)/2;
        while(s<=e){
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target){
                return binSearch(nums, target, s, mid -1);
            }else if(nums[mid] < target){
                return binSearch(nums, target, mid + 1, e);
            }
        }
        return -1;
    }
}