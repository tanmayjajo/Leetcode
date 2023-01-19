class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxProfit = 0;
        int i = 0;
        int min = 0;
        
        while(i<prices.size()){
            if(prices[i] < prices[min]){
                min = i;
            }
            
            maxProfit = max(maxProfit, prices[i] - prices[min]);
            i++;
        }
        
        return maxProfit;
    }
};