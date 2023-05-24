class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string ans = "";
        
        for(int i = 0; i < strs[0].size(); i++){
            char ch = strs[0][i];
            for(int j = 0; j < strs.size(); j++){
                if(strs[j].size() <= i) return ans;
                
                if(strs[j][i] != ch) return ans;
            }
            ans.push_back(ch);
        }
        
        return ans;
    }
};