class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] arr = new int[101];
        int pairs = 0;
        for(int n : nums){
            pairs += ++arr[n]%2 == 0 ? 1 : 0;
        }
        return new int[] {pairs, nums.length - pairs*2};
    }
}