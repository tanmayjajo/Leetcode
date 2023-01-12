class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch>= 48 && ch<= 57){
                str.append(ch);
            }else if(ch >= 65 && ch <= 90){
                str.append((char)(ch - 'A' + 'a'));
            }else if(ch >= 97 && ch<=122){
                str.append(ch);
            }
        }
        
        return isPalin(str.toString());
    }
    
    
    public boolean isPalin(String s){
        int i = 0;
        int j = s.length()-1;
        
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    
}