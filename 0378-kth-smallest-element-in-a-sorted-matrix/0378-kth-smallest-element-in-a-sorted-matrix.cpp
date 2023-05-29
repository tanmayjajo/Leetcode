class Solution {
public:
    int kthSmallest(vector<vector<int>>& matrix, int k) {
        int n = matrix.size();
        priority_queue<int> pq;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                while(pq.size() > k) pq.pop();
                pq.push(matrix[i][j]);
            }
        }
        while(pq.size() > k) pq.pop();
        return pq.top();
    }
};