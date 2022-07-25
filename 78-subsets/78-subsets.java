class Solution {
    
    public List<List<Integer>> list = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> ls = new ArrayList<>();
        subs(nums, ls, 0);
        return list;
    }
    
    public void subs(int[] nums, List<Integer> ls, int i){
        if(i == nums.length){
            list.add(new ArrayList<>(ls));
            return;
        }
        
        subs(nums, ls, i+1);
        ls.add(nums[i]);
        subs(nums, ls, i+1);
         ls.remove(ls.size() - 1);
    }
}