/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    // last = 0 means left
    // last = 1 means right
    
    int res = 0;
    int longestZigZag(TreeNode* root) {
        find(root, 1);
        return res;
    }
    
    int find(TreeNode* root, int last){
        if(root == NULL) return -1;
        
        int l = find(root->left, 1);
        int r = find(root->right, 0);
        
        res = max(res, max(1+r, 1+l));
        
        return (last == 0) ? l+1 : r+1;
    }
};