class Solution {
    
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    
    
    public List<List<Integer>> permute(int[] nums) {    
        List<Integer> ls = new ArrayList<Integer>();
        int i = 0;
        helper(nums, ls, i);
        
        return list;
    }
    
    public void helper(int[] nums, List<Integer> ls, int i){    
        if(i == nums.length){
            list.add(new ArrayList<>(ls));
            return;
        }
        
        for(int j = 0; j <= ls.size(); j++){
            ls.add(j, nums[i]);
            i++;
            helper(nums, ls, i);
            i--;
            ls.remove(j);
        }
        
    }
    
}