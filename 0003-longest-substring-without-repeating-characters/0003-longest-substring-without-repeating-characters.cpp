class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.size();
        int ans = 0;
        
        unordered_map<char, int> m;
        int start = 0;
        
        for(int end = 0; end < n; end++){
            if(m[s[end]] == 0){
                ans = max(ans, end - start + 1);
            }else{
                while(m[s[end]] > 0){  
                    m[s[start++]]--;
                }
            }
            m[s[end]]++;
        }
        
        return ans;
    }
};