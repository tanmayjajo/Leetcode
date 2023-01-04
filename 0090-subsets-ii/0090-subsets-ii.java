class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> AnsList = new ArrayList<>();
        
        Arrays.sort(nums);
        helper(0, nums, new ArrayList<>(), AnsList);
        return AnsList;
    }
    
    public void helper(int ind, int[] nums, List<Integer> list, List<List<Integer>> AnsList){
        AnsList.add(new ArrayList<>(list));
        for(int i = ind; i < nums.length; i++){
            if(i!=ind && nums[i] == nums[i-1]) continue;
            
            list.add(nums[i]);
            helper(i+1, nums, list, AnsList);
            list.remove(list.size() - 1);
                    
        }
        
    }
}