class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.size();
        int ans = 0;
        
        unordered_map<char, int> m;
        int start = 0;
        
        for(int end = 0; end < n; end++){
            m[s[end]]++;
            
            while(m[s[end]] > 1){
                m[s[start++]]--;
            }
            
            ans = max(ans, end - start + 1);
        }
        
        return ans;
    }
};