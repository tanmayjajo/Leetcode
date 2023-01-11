class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i<strs[0].length() && i<strs[n-1].length()){
            if(strs[0].charAt(i) == strs[n-1].charAt(i)){
                ans.append(strs[0].charAt(i));
            }else{
                break;
            }
            i++;
        }
        return ans.toString();
    }
}