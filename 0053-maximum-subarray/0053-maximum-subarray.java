class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        int curr = 0;
        
        for(int i =0; i < nums.length; i++){
            curr = Maxim(curr + nums[i], nums[i]);
            
            max = Maxim(max, curr);
        }
        return max;   
    }
    public int Maxim(int a, int b){
        if(a>b) return a;
        return b;
    }
}