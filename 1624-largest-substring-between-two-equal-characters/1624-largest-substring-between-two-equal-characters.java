class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        
        int[] firstOcc = new int[26];
        for(int i = 0; i < 26; i++){
            firstOcc[i] = -1;
        }
        int ans = -1;
        for(int i =0; i < s.length(); i++){
            if(firstOcc[s.charAt(i) - 97] == -1){
                firstOcc[s.charAt(i) - 97] = i;
            }else{
                ans = Math.max(ans , i - firstOcc[s.charAt(i) - 97] - 1);
            }
        }
        return ans;
    }
}