class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string ans = "";
        
        sort(strs.begin(), strs.end());
        string a = strs[0], b = strs[strs.size()-1];
        
        int i = 0;
        while(i < a.size() && i < b.size()){
            if(a[i] == b[i]) ans.push_back(a[i]);
            else break;
            i++;
        }
        return ans;
    }
};