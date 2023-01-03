class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int a = 0;
        
        for(int i = 0; i < t.length(); i++){
            if(a==s.length()) return true;
            if(t.charAt(i) == s.charAt(a)){
                a++;
            }
        }
        if(a==s.length()) return true;
        return false;
    }
}