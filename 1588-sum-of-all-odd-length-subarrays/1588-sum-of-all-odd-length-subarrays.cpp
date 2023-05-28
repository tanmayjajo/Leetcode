class Solution {
public:
    int sumOddLengthSubarrays(vector<int>& arr) {
        int n = arr.size();
        vector<int> prefix(n+1, 0);
        for(int i = 1; i <= n; i++){
            prefix[i] = prefix[i-1] + arr[i-1];
        }
        
        int sum = 0;
        for(int start = 0; start <= n; start++){
            for(int end = start+1; end <= n; end = end + 2){
                sum += prefix[end] - prefix[start];
            }
        }
        
        return sum;
    }
};