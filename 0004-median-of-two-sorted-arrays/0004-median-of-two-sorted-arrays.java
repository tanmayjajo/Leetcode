class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        double[] arr = new double[nums1.length + nums2.length];
       
        int a = 0; // this pointer will move on nums1
        int b = 0; // this pointer will move on nums2
        
        int count = 0; // it will take care of the total length covered
    
        while(a < nums1.length && b < nums2.length){
            if(nums1[a] < nums2[b]){
                arr[count] = nums1[a];
                a++;
            }else{
                arr[count] = nums2[b];
                b++;
            }
            count++;
        }
        while(a < nums1.length && b >= nums2.length){
            arr[count] = nums1[a];
            a++;
            count++;
        }
        
        while(a >= nums1.length && b < nums2.length){
            arr[count] = nums2[b];
            b++;
            count++;
        }
        
        for (double element: arr) {
            System.out.println(element);
        }
        
        if(arr.length%2 == 0){
            return (arr[arr.length/2] + arr[arr.length/2 - 1])/2;
        }
        return arr[arr.length/2];
    }
}