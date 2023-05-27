class Solution {
public:
    int characterReplacement(string s, int k) {
        int ans = 0;
        int start = 0;
        vector<int> freq(26);
        
        for(int end = 0; end < s.size(); end++){
            // adding to window
            freq[s[end] - 'A']++;
            
            // removing from window
            while(end - start + 1 - *max_element(freq.begin(), freq.end()) > k){
                freq[s[start] - 'A']--;
                start++;
            }
            
            // considering the valid window
            ans = max(ans, end - start + 1);
        }
        
        return ans;
    }
};