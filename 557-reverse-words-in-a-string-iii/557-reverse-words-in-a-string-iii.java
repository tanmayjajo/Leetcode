class Solution {
    public String reverseWords(String s) {
        
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ' || i == s.length() -1){
                if(i == s.length() -1){
                    s = revW(s,j,i);
                }else{
                    s = revW(s,j,i-1);
                }
                j = i+1;
            }
        }
        return s;
    }
    
    public String revW(String s, int a, int b){
        
        char[] ch = s.toCharArray();
        
        while(a<b){
            char temp = ch[a];
            ch[a] = ch[b];
            ch[b] = temp;
            a++;
            b--;
        }
        
        return String.valueOf(ch);
    }
}