class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){return false;}
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        while(x>0){
            arr.add(x%10);
            x = x/10;
            i++;
        }
        int k = 0;
        while(k < i){
            if(arr.get(i - 1) != arr.get(k)){
                return false;
            }
            i--;
            k++;
        }
        return true;
    }
}