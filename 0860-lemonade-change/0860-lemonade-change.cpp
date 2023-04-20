class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        int tenC = 0;
        int fiveC = 0;
        
        for(auto val : bills){
            if(val==5) fiveC++;
            else if(val==10) tenC++, fiveC--;
            else if(tenC) tenC--, fiveC--;
            else fiveC-=3;
            
            if(fiveC<0) return false;
        }
        return true;
    }
};