class Solution {

vector<int> nums;
public:
    
    int check(int a, vector<int> &potions, long long success){
        int l = 0;
        int h = potions.size()-1;
        int ans = potions.size();
        
        while(l<=h){
            int mid = l + (h-l)/2;
            
            if(potions[mid]*1ll*a >= success){
                ans = mid;
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        
        return potions.size() - ans;
    }
    
    vector<int> successfulPairs(vector<int>& spells, vector<int>& potions, long long success) {
        sort(potions.begin(), potions.end());
        
        for(int i = 0; i < spells.size(); i++){
            int ans = check(spells[i], potions, success);
            nums.push_back(ans);
        }
        
        return nums;
    }
};