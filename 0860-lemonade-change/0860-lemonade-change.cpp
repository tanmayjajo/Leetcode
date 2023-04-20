class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        int tenC = 0;
        int fiveC = 0;
        
        for(int i = 0; i < bills.size(); i++){
            if(bills[i] == 5){
                fiveC++;
            }else if (bills[i] == 10){
                tenC++;
                if(fiveC > 0) fiveC--;
                else return false;
            }else{
                if(tenC > 0 && fiveC > 0){
                    tenC--;
                    fiveC--;
                }else if(fiveC > 2){
                    fiveC -= 3;
                }else{
                    return false;
                }
            }
        }
        
        return true;
    }
};