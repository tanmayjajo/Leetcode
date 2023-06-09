class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int l = 0, r = 0;
        unordered_map<char, int> m;
        int ans = 0;
        
        while(r < s.size()){
            m[s[r]]++;
            while(m[s[r]] > 1){
                m[s[l]]--;
                l++;
            }
            ans = max(ans, r-l+1);
            r++;
        }
        return ans;
    }
};