class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        int ans = 0; // will store max len
        
        unordered_map<int, int> m; // fruit and its freq
        int s = 0; // starting pointer of window
        
        for(int e = 0; e < fruits.size(); e++){
            // expanding the window
            m[fruits[e]]++;
            
            // contracting the window
            while(m.size()>2){
                m[fruits[s]]--;
                if(m[fruits[s]] == 0) m.erase(fruits[s]);
                s++;
            }
            
            ans = max(ans, e-s+1);
        }
        return ans;
    }
};