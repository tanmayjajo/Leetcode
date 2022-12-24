class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, int[]> map = new HashMap<>();
        
        
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), new int[]{i,0});
            }else{
                map.put(s.charAt(i), new int[]{map.get(s.charAt(i))[0], i});
            }
        }
        if(map.size() == s.length()) return -1;
        
        int ans = Integer.MIN_VALUE;
        
        for(int[] elem: map.values()){
            ans = Math.max(ans, elem[1]-elem[0] - 1);
        }
        
        return ans;   
    }
}