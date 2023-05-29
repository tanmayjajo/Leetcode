class Solution {
public:
    // i will iterate all over the array
    // move can be 0, 1, 2 -> represents moves made until now, jumping from 1 array to another is called one move
    // prevArr can be 0, 1 -> represents the array from which we took our elem previously
    
    // dp will store i, move, prevArr
    int dp[100010][5][5];
    int n;
    vector<int> pref1, pref2;
    
    int solve(int i, int move, int prevArr, int n, vector<int>& nums1, vector<int>& nums2){
        if(i == n) return 0;
        
         if (dp[i][move][prevArr] != -1)
             return dp[i][move][prevArr];
        
        int res;
        if(move < 2){
            int a, b;
            if(prevArr == 0){
                a = nums1[i] + solve(i+1, move+1, 1, n, nums1, nums2);// took from 1st array and changed
                b = nums1[i] + solve(i+1, move, prevArr, n, nums1, nums2); // took from 1st array and not changed;
            }else if(prevArr == 1){
                a = nums2[i] + solve(i+1, move+1, 0, n, nums1, nums2);// took from 2nd array and changed
                b = nums2[i] + solve(i+1, move, prevArr, n, nums1, nums2); // took from 2nd array and not changed;
            }
            res = max(a, b);
        }else if(move == 2){
            if(prevArr == 0){
                res = pref1[n] - pref1[i];
            }else if(prevArr == 1) {
                res = pref2[n] - pref2[i];
            }
        }
        return dp[i][move][prevArr] = res;
    }
    
    int maximumsSplicedArray(vector<int>& nums1, vector<int>& nums2) {
        n = nums1.size();
        memset(dp, -1, sizeof(dp));
        pref1.resize(n+1);
        pref2.resize(n+1);

        for(int i = 0; i < n; i++){
            pref1[i+1] = pref1[i] + nums1[i];
        }
        for(int i = 0; i < n; i++){
            pref2[i+1] = pref2[i] + nums2[i];
        }
        
        return max(solve(0, 0, 0, n, nums1, nums2), solve(0, 0, 1, n, nums1, nums2));
    }
};