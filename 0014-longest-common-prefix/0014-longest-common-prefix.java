class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder ans = new StringBuilder();
        
        // if a char is supposed to be included in answer or not
        // this variable will store the info and use it for breaking the loops
        
        boolean isMatch = true;
        
        // iterating over chars of first word in the array
        // because the answer cannot exceed it
        for(int i = 0; i < strs[0].length(); i++){
            
            // one by one taking each character of first word 
            char ch = strs[0].charAt(i);
            
            // iterating whole array
            for(int j = 1; j < strs.length; j++){
                
                if(strs[j].length() == i){
                    isMatch = false;
                    break;
                }
                // checking if the word's length is less than that of first word
                // and character are common or not
                // if not then update isMatch variable and break the loop
                if(strs[j].length() < i || ch != strs[j].charAt(i)){
                    isMatch = false;
                    break;
                }
            }
            if(isMatch == false){
                // if it got match then ans contains the answer
                break;
            }else{
                // if not then we can gather more chars in longest common prefix
                ans.append(ch);
            }
        }
        // changing stringbuilder to string before returning
        return ans.toString();
    }
}