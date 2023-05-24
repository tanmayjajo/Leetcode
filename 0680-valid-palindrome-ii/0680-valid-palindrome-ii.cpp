class Solution {
public:
    bool validPalindrome(string &s, int l, int r, int count){
        if(count > 1) return false;
        if(l > r) return true;
        
        if(s[l] == s[r]){
            return validPalindrome(s, l+1, r-1, count);
        }else{
            return validPalindrome(s, l, r-1, count+1) || validPalindrome(s, l+1, r, count+1);
        }
    }
    
    bool validPalindrome(string s) {
        return validPalindrome(s, 0, s.size()-1, 0);
    }
};