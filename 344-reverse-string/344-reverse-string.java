class Solution {
    public void reverseString(char[] s) {
        rev(s, 0, s.length - 1);
        return;
        
    }
    public void rev(char[] s, int i, int j){
        if(i>j){
            return;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        rev(s, ++i, --j);
    }
}