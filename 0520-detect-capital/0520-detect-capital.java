class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1) return true;
        if(word.length() == 2){
            if(!capsCheck(word.charAt(0)) && capsCheck(word.charAt(1))){
                return false;
            }
            return true;
        }
        if( capsCheck(word.charAt(0)) ){
            if(capsCheck(word.charAt(1))){
                // if first chars are Caps then..
                // finding any lowercase in rest of the word to return false
                for(int i = 2; i < word.length(); i++){
                    if(!capsCheck(word.charAt(i))) return false;
                }
            }else{
                // if first char is caps and second is small then ....
                // finding any cap in rest of the word to return false
                for(int i = 2; i < word.length(); i++){
                    if(capsCheck(word.charAt(i))) return false;
                }
            }
        }else{
            // first char is lowercase then..
            // finding any uppercase in rest of the word
            for(int i = 1; i < word.length(); i++){
                if(capsCheck(word.charAt(i))) return false;
            }
        }
       return true;
    }
    public boolean capsCheck(char c){
        if(c<='z' && c>='a'){
            return false;
        }
        return true;
    }
}