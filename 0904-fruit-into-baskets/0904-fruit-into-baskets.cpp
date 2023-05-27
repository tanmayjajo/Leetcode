class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        int n = fruits.size();
        unordered_map<int, int> m;
        
        int maxLen = 0;
        int start = 0;
        
        for(int end = 0; end < n; end++){
            // adding in window
            m[fruits[end]]++;
            
            // removing from window
            while(m.size() > 2){
                m[fruits[start]]--;
                if(m[fruits[start]] == 0) m.erase(fruits[start]);
                start++;
            }
            
            // considering a valid window
            maxLen = max(maxLen, end - start + 1);
        }
        
        return maxLen;
    }
};