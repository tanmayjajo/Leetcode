class Solution {
    public int strStr(String haystack, String needle) {
        int ans = -1;
        int count = 0;
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            count = 0;
            for(int j = 0; j < needle.length(); j++){
                if(haystack.charAt(j+i) != needle.charAt(j)){
                    break;
                }else{
                    count++;
                }
            }
            if(count == needle.length()){
                ans = i;
                break;
            }
        }
        
        
        return ans;
    }
}