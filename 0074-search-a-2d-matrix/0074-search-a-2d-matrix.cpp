class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size();
        int n = matrix[0].size();
        
        // index for whole, treating it as 1D array
        int s = 0, e = m*n-1;
        
        while(s <= e){
            int mid = s + (e-s)/2;
            
            int midR = mid/n;
            int midC = mid%n;
            
            if(matrix[midR][midC] == target){
                return true;
            }else if(matrix[midR][midC] > target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        
        return false;
    }
};