class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        int ans = n;
        
        while(!set.contains(ans)){
            set.add(ans);
            ans = iterate(ans);
            // System.out.println(ans);
        
            if(ans==1) return true;
        }
        return false; 
    }
    
    public int iterate(int n){
        if(n==0) return 0;
        int ans = 0;
        while(n>0){
            int temp = n%10;
            ans += temp*temp;
            n = n/10;
        }
        return ans;
    }
}