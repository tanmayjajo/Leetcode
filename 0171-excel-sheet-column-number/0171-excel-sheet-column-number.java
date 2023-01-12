class Solution {
    public int titleToNumber(String s) {
        int ans = 0;
        
        int num = 1;
        while(s.length() > 0){
            int n = s.length();
            int lastCh = s.charAt(n-1);
            s = s.substring(0, n-1);
            ans = ans + num*(lastCh - 'A' + 1);
            num = num*26;
        }
        return ans;
    }
}