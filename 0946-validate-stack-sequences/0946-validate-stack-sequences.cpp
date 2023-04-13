class Solution {
public:
    bool validateStackSequences(vector<int>& pushed, vector<int>& popped) {
        stack<int> stk;
        int i = 0; // popped
        int j = 0; // pushed
        
        while(j < pushed.size()){
            stk.push(pushed[j++]);
            while(!stk.empty() && i < popped.size() && popped[i] == stk.top()){
                stk.pop();
                i++;
            }
        }
        
        if(stk.empty()) return true;
        return false;
    }
};