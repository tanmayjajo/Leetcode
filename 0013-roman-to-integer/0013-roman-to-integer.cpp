class Solution {
public:
    int romanToInt(string s) {
        unordered_map<char, int> m = {
            {'I', 1},
            {'V', 5},
            {'X', 10},
            {'L', 50},
            {'C', 100},
            {'D', 500},
            {'M', 1000}
        };
        
        int i = s.size()-1;
        int ans = m[s[i]];
        i--;
        
        while(i >= 0){
            if(m[s[i]] >= m[s[i+1]]){
                ans += m[s[i]];
            }else{
                ans -= m[s[i]];
            }
            i--;
        }
        return ans;
    }
};