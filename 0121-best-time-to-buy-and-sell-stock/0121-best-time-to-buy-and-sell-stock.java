class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int minValueTillNow = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minValueTillNow){
                minValueTillNow = prices[i];
            }
            if(maxProfit < prices[i] - minValueTillNow){
                maxProfit = prices[i] - minValueTillNow;
            }
        }
        return maxProfit;
    }
}