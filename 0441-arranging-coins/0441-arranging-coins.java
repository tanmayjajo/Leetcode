class Solution {
    public int arrangeCoins(int n) {
        int count = 0;
        int i = 1;
        while(n>=0){
            n = n - i;
            i++;
            count++;
        }
        return count - 1;
    }
}