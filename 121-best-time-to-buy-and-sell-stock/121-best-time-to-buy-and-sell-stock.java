class Solution {
    public int maxProfit(int[] prices) {
        int mini = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < mini){
                mini = prices[i];
            }
            if(prices[i] - mini > maxProfit) {
                maxProfit = prices[i] - mini;
            } 
        }
        return maxProfit;
    }
}