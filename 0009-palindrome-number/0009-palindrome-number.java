class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        
        int reversedNum = 0;
        int xCopy = x;
        while(xCopy>0){
            reversedNum *= 10;
            reversedNum += xCopy%10;
            
            xCopy = xCopy/10;
        }
        // System.out.println(xCopy);
        // System.out.println(reversedNum);
        
        if(reversedNum == x){
            return true;
        }
        return false;
    }
}