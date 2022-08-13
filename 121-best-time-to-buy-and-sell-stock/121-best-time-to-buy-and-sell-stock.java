// one traversal and maintaining the minimum number we get in the array, 
// and also maintaining the maximum profit that we can get after selling at current index
// when bought at the minimum index that we maintained.

// maintain both and eventually we will return maximum profit that we maintained

// initialising maxProfit with 0 because in the worst case of Descending Values, our profit will be 0 by default
 

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
