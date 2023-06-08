class Solution {
public:
    int threeSumMulti(vector<int>& arr, int target) {
        int mod = 1000000007;
        sort(arr.begin(), arr.end());
        int ans = 0;
        
        for(int i = 0; i < arr.size(); i++){
            int newTarget = target - arr[i];
            
            unordered_map<int, int> m;
            for(int j = i+1; j < arr.size(); j++){
                if(m.count(arr[j])){
                    ans += m[arr[j]];
                    m[newTarget - arr[j]]++;
                }else{
                    m[newTarget - arr[j]]++;
                }
                ans = ans%mod;
            }
        }
        return ans;
    }
};