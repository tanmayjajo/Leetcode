class Solution {
    public static int[][] dp = new int[2500][2501];
    
    public int lengthOfLIS(int[] nums) {
        for(int row[]: dp){
            Arrays.fill(row,-1);
        }
        return printSubSeq(nums, 0, -1);
    }
    
    
    public static int printSubSeq(int[] arr, int i, int prev){
        if(i==arr.length) return 0;
        if(dp[i][prev+1] != -1) return dp[i][prev+1];
		
        int notTake = 0 + printSubSeq(arr, i+1, prev); // not take
		int take = 0;
        if(prev == -1 || arr[i] > arr[prev]){ // take
			take = Math.max(notTake, 1 + printSubSeq(arr, i+1, i));
		}
        return dp[i][prev+1] = Math.max(notTake, take);
        
	}
}
