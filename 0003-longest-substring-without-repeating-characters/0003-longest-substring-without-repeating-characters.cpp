class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int ans = 0;
        unordered_map<char, int> m;
        int l = 0;
        for(int e = 0; e < s.size(); e++){
            m[s[e]]++;
            
            while(m[s[e]] > 1){
                m[s[l]]--;
                l++;
            }
            ans = max(ans, e-l+1);
        }
        return ans;
    }
};