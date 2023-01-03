class Solution {
    public int distinctPrimeFactors(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int ele: nums){
            for(int i = 2; i*i <= ele; i++){
                while(ele%i == 0){
                    set.add(i);
                    ele = ele/i;
                }
            }
            if(ele>1) set.add(ele);
        }
        return set.size();
    }
}