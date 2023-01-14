/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode ans = new TreeNode(-1);
 
    public void flatten(TreeNode root) {
        if(root == null) return;
        ans.right = root;
        ans = root;
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        root.right = null;
        
        flatten(left);
        flatten(right);
    }    
}