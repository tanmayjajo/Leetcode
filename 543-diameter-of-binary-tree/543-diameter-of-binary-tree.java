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
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null) return 0;
        
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
             
        int max = Math.max(left, right);
        
        int diameterThroughRoot = height(root.left) + height(root.right);
        if(root.left!=null){
            diameterThroughRoot = diameterThroughRoot + 1;
        }
        if(root.right!=null){
            diameterThroughRoot = diameterThroughRoot + 1;
        }
        
        return Math.max(diameterThroughRoot, max);
    }
    
    
    public int height(TreeNode root){
        if(root==null) return 0;
        if(root.left == null && root.right==null) return 0;
        
        int left = height(root.left);
        int right = height(root.right);
        
        return Math.max(left, right) + 1;
    }
}