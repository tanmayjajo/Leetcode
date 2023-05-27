class Solution {
public:
    string minWindow(string s, string t) {
        // stores count of chars to be added 
        unordered_map<char, int> count;
        
        for(int i = 0; i < t.size(); i++){
            count[t[i]]++;
        }
        int n = s.size();
        
        int minLen = INT_MAX;
        int minStart = 0;
        
        // no. of distinct chars in t remaining to be included
        int remaining = count.size(); 
        
        int start = 0;
        
        for(int end = 0; end < n; end++){            
            count[s[end]]--;
        
            // all occurences of this char in t is included in window
            if(count[s[end]] == 0) remaining--; 
            
            while(remaining == 0){
                if(minLen > (end - start + 1)){
                    minLen = (end - start + 1);
                    minStart = start;
                }
                
                // remove start from window and increment start
                count[s[start]]++;
                
                // if count is negative means we have sufficient amount 
                // of that char in the window
                if(count[s[start]] > 0) remaining++;
                start++;
            }
        }
        
        return (minLen == INT_MAX) ? "" : s.substr(minStart, minLen);
    }
};