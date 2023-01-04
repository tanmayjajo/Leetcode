class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> Anslist = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        
        subs(nums, ls, 0, Anslist); 
        
        return Anslist; 
    }
    
    public void subs(int[] nums, List<Integer> ls, int i, List<List<Integer>> AnsList){
        if(i == nums.length){
            AnsList.add(new ArrayList<>(ls));
            return;
        }
        // not pick
        subs(nums, ls, i+1, AnsList);
        
        // pick
        ls.add(nums[i]);
        subs(nums, ls, i+1, AnsList);
        ls.remove(ls.size() - 1);
        
    }
}