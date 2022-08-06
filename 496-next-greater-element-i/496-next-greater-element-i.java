class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        for(int i = 0; i < nums1.length; i++){
            int a = 0;
            for(int j = 0; j < nums2.length; j++){
                if(nums2[j] == nums1[i]){
                    a = j;
                }
            }
            
            for(int j = a; j < nums2.length; j++){
                if(nums2[j] > nums2[a]){
                    nums1[i] = nums2[j];
                    break;
                } else{
                    nums1[i] = -1;
                }
            }
        }
        return nums1;
    }
}