class Solution {
public:
    int partitionString(string s) {
        map<char, int> m;
        
        int ans = 1;
        for(int i = 0; i < s.size(); i++){
            if(m.count(s[i]) == 0){
                m[s[i]]++;
            }else if(m.count(s[i]) == 1){
                m.clear();
                m[s[i]]++;
                ans++;
            }
        }
        return ans;
    }
};