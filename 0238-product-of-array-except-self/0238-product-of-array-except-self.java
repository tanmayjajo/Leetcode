class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProd = 1;
        boolean hasZero = false;
        for(int i = 0; i < nums.length; i++){
            if(!hasZero){
                if(nums[i]==0){
                    hasZero = true;
                }else{
                    totalProd *= nums[i];
                }
            }else{
                totalProd *= nums[i];
            }
        }
        
        
        for(int i = 0; i < nums.length; i++){
            
            if(hasZero){
                if(nums[i] != 0){
                    nums[i] = 0;
                }else{
                    nums[i] = totalProd;
                }
            }else{
                nums[i] = totalProd/nums[i];
            }
        }
        return nums;
    }
}