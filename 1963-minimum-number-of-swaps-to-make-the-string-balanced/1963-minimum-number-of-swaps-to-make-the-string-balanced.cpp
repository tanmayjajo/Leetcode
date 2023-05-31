class Solution {
public:
    int minSwaps(string s) {
        int n = s.size();
        
        int right = n-1;
        int balance = 0;
        int count = 0;
        for(int left = 0; left < right; left++){
            if(s[left] == '[') balance++;
            else if(s[left] == ']') balance--;
            
            if(balance == -1){
                while(s[right] == ']'){
                    right--;
                }
                swap(s[left], s[right]);
                count++;
                balance = 1;
            }
        }
        return count;
    }
};