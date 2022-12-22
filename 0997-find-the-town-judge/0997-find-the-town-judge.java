class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int[] inDegree = new int[n];
        int[] outDegree = new int[n];
        
        for(int[] elem: trust){
            inDegree[elem[1] - 1]++;    // filling at index - 1 for any person
            outDegree[elem[0] - 1]++;
        }
        
        for(int i = 0; i < n; i++){
            if(inDegree[i] == n-1 && outDegree[i] == 0){
                return i+1;
            }
        }
        return -1;
    }
}