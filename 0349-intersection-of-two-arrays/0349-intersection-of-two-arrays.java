class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        List<Integer> list = new ArrayList<>();
    
        HashSet<Integer> set1 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }
        
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums2.length; i++){
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        
        int[] ans = new int[set2.size()];
        Iterator<Integer> itr = set2.iterator();
        for(int i = 0; i < ans.length; i++){
            ans[i] = itr.next();
        }
         
        
        return ans;
    }
}