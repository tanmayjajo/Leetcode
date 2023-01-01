class Solution {
    public int countDigits(int num) {
        int count = 0;
        int n = num;
        while(num>0){
            int ld = num%10;
            num = num/10;
            if(n%ld == 0) count++;
        }
        return count;
    }
}