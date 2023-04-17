class Solution {
public:
    
    void dfs(int src, vector<vector<int>> &adj, vector<int> &vis){
        vis[src] = 1;
        
        for(auto &child: adj[src]){
            if(vis[child] == 0){
                dfs(child, adj, vis);
            }
        }
    }
    
    int findCircleNum(vector<vector<int>>& isConnected) {
        int V = isConnected.size();
        
        vector<vector<int>> adj(V);
        for(int i = 0; i < V; i++){
            for(int j = 0; j < V; j++){
                if(isConnected[i][j] == 1) adj[i].push_back(j);
            }
        }
        
        vector<int> vis(V, 0);
        int count = 0;
        
        for(int i = 0; i < V; i++){
            if(vis[i] == 0){
                count++;
                dfs(i, adj, vis);
            }
        }
        return count;
    }
};