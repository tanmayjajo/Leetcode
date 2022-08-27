class Solution {
    public int maximumGroups(int[] grades) {
        if(grades.length < 3) return 1; // base case separately taken care of
        Arrays.sort(grades); // this is important to take care of 1st condition of question
        
        int hehe = vals(grades.length);
        return hehe;
    }
    
    // for calculating the number of 1,2,3,4.... required that sum up to n
    // this will help us satisfy 2nd condition of the question
    // 1st condition of question is kind of already satified for all answers that we get because we have sorted the array in the first place
    public int vals(int n){ 
        int D = 1 + 8 * n;
        int he = (int)(Math.pow(D, 0.5));
        
        int ansOne = (-1 + he)/2;
        int ansTwo = (-1 - he)/2;
        return Math.max(ansOne, ansTwo);
    }
}