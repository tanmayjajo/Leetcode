class Solution {
    public int[] sortArray(int[] arr) {
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = sortArray(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sortArray(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    
    
    private int[] merge(int[] a, int[] b){
        int[] arr = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < a.length&& j < b.length){
            if(a[i] < b[j]){
                arr[k] = a[i];
                i++;
            } else{
                arr[k] = b[j];
                j++;
            }
            k++;
        }
        while(i < a.length){
            arr[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length){
            arr[k] = b[j];
            j++;
            k++;
        }

        return arr;
    }
    
}