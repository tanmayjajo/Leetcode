class Solution {
public:
    bool check(string s){
        int l = 0, r = s.size()-1;
        while(l<r){
            if(s[l] != s[r]) return false;
            else{
                l++; r--;
            }
        }
        return true;
    }
    bool isPalindrome(string s) {
        string str = "";
        for(int i = 0; i < s.size(); i++){
            if(s[i]-'0' >= 0 && s[i]-'0' <= 9){
                str.push_back(s[i]);
            }
            if((s[i]>= 97 && s[i] <= 122)){
                str.push_back(s[i]);
            }
            if(s[i] >= 65 && s[i] <= 90){
                str.push_back(s[i] - 'A' + 'a');
            }
        }
        
        return check(str);
    }
};