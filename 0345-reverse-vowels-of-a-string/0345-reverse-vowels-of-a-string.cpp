class Solution {
public:
    string reverseVowels(string s) {
        int l = 0, r = s.size()-1;
        set<char> st = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        
        while(l<r){
            while(l < r && !st.count(s[l])){
                l++;
            }
            while(l < r && !st.count(s[r])){
                r--;
            }
            if(l >= r) return s;
            
            swap(s[l], s[r]);
            l++; r--;
        }
        return s;
    }
};