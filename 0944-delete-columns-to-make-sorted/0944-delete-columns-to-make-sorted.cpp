class Solution {
public:
    int minDeletionSize(vector<string>& strs) {
        int count = 0;
        
        for(int i = 0; i < strs[0].size(); i++){
            int alpha = 0;
            for(int j = 0; j < strs.size(); j++){
                if(alpha <= strs[j][i]){
                    alpha = strs[j][i];
                }else{
                    count++;
                    break;
                }
            }
        }
        return count;
    }
};