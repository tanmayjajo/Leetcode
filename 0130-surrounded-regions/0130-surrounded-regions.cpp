class Solution {
public:
    void bfs(int r, int c, vector<vector<char>>& board){
        if(r < 0 || c < 0 || r >= board.size() || c >= board[0].size()) return;
        if(board[r][c] == 'X' || board[r][c] == 'C') return;
        
        board[r][c] = 'C';
        
        bfs(r+1, c, board);
        bfs(r-1, c, board);
        bfs(r, c+1, board);
        bfs(r, c-1, board);
    }
    void solve(vector<vector<char>>& board) {
        int n = board.size();
        int m = board[0].size();
        
        // lets traverse through the boundaries
        int i = 0;
        int j = 0;
        
        for(; i < n; i++){
            if(board[i][j] == 'O'){
                bfs(i, j, board);
            }
        }
        i = 0;
        j = m-1;
        for(; i < n; i++){
            if(board[i][j] == 'O'){
                bfs(i, j, board);
            }
        }
        i = 0;
        j = 0;
        for(; j < m; j++){
            if(board[i][j] == 'O'){
                bfs(i, j, board);
            }
        }
        i = n-1;
        j = 0;
        for(; j < m; j++){
            if(board[i][j] == 'O'){
                bfs(i, j, board);
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 'C') board[i][j] = 'O';
                else board[i][j] = 'X';
            }
        }
        
    }
};