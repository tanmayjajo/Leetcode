class Solution {
public:
    int getLastMoment(int n, vector<int>& left, vector<int>& right) {
        int mini = n, maxi = 0;
        
        if(right.size()!=0) mini = *min_element(right.begin(), right.end());
        
        if(left.size()!=0) maxi = *max_element(left.begin(), left.end());
        
        return max(max(n-mini, maxi), 0);
    }
};