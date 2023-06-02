class Solution {
public:
    bool dfs(int V, int node, int prev, vector<int> &vis, vector<vector<int>>& graph){
        if(prev == 1){
            vis[node] = 2;
        }else{
            vis[node] = 1;
        }
        
        bool ans = true;
        for(auto adjNode: graph[node]){
            if(vis[adjNode] == 0){
                ans = ans && dfs(V, adjNode, vis[node], vis, graph);
            }else{
                if(vis[adjNode] == vis[node])
                    return false;
            }
        }
        return ans;
    }
    
    bool isBipartite(vector<vector<int>>& graph) {
        int V = graph.size();
        vector<int> vis(V, 0); // will track colors of visited as well
        
        bool ans = true;
        for(int i = 0; i < V; i++){
            if(vis[i] == 0){
                ans = ans && dfs(V, i, 2, vis, graph);
            }
        }
        return ans;
    }
};