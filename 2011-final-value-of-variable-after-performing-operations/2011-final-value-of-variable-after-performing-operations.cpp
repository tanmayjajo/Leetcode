class Solution {
public:
    int finalValueAfterOperations(vector<string>& oper) {
        int x = 0;
        for(int i = 0; i < oper.size(); i++){
            if(oper[i][1] == '-'){
                x--;
            }else if(oper[i][1] == '+'){
                x++;
            }
        }
        return x;
    }
};