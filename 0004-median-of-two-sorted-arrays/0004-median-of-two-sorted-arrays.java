class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        Arrays.sort(arr);

        for (double element: arr) {
            System.out.println(element);
        }
        
        double a = arr[arr.length/2]; 
        if(arr.length%2 == 0){
            double b = arr[arr.length/2 - 1];
            return (a + b)/2;
        }
        return a;
    }
}