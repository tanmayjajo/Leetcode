class Solution {
public:
    void bfs(int i, vector<vector<int>> &adjList, vector<int> &vis){
        queue<int> q;
        
        q.push(i);
        vis[i] = 1;
        
        while(q.size()){
            int boom = q.front();
            for(int i = 0; i < adjList[boom].size(); i++){
                int ele = adjList[boom][i];
                if(vis[ele] == 0){
                    vis[ele] = 1;
                    q.push(ele);
                }
            }
            q.pop();
        }
    }
    
    int findCircleNum(vector<vector<int>>& isConnected) {
        int n = isConnected.size();
        vector<vector<int>> adjList(n);
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j && isConnected[i][j]) adjList[i].push_back(j);
            }
        }
        
//         for(int i = 0; i < n; i++){
//             cout << i+1 << ":=> ";
//             for(auto j: adjList[i]) cout << j +1 << " ";
//             cout << endl;
//         }
        
        
        int count = 0;
        vector<int> vis(n, 0);
        
        for(int i = 0; i < n; i++){
            if(vis[i] == 0){
                count++;
                bfs(i, adjList, vis);
            }
        }
        
        return count;
    }
};