class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for(int i: nums){
            totalSum += i;
        }
        if((totalSum&1) == 1) return false;
        
        int Smax = totalSum/2;
        
        boolean[][] t = new boolean[nums.length][Smax+1];
        for(int j = 0; j < Smax+1; j++){
            t[0][j] = false;
        }
        for(int i =0; i < nums.length; i++){
            t[i][0] = true;
        }
        
        
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < Smax+1; j++){
                if(nums[i-1] <= j){
                    t[i][j] = t[i-1][j-nums[i-1]] || t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[nums.length-1][Smax];
    }
    
    
}