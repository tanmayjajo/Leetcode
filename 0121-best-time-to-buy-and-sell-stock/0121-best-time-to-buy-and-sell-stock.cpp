class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxprofit = 0;
        int minPrice = 1e8;
        for(int i = 0; i < prices.size(); i++){
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }
            maxprofit = max(maxprofit, prices[i] - minPrice);  
        }
        return maxprofit;
    }
};