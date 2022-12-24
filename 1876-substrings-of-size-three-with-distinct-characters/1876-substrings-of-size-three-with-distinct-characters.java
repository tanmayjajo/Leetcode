class Solution {
    public int countGoodSubstrings(String s) {
        int pointer = 0;
        int count = 0;
        if(s.length() < 3){
            return 0;
        }
        while( pointer < s.length() - 2){
            char first = s.charAt(pointer);
            char second = s.charAt(pointer + 1);
            char third = s.charAt(pointer + 2);
            
            if(first != second && second != third && first != third){
                count++;
            }
            pointer++;    
        }
        
        return count;
    }
}