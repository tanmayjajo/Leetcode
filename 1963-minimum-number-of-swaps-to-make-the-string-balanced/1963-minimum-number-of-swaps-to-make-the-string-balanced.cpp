class Solution {
public:
    // we'll go greedy
    // use two pointer technique
    
    // traverse the whole string
    // if '[' is found then move ahead expecting a ']' in future (for sure)
    // if ']' is found and no prev '[' for it to be coupled then there is need to swap
    // swap it with '[' from the end
    
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