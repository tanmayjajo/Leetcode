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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        
        st.push(curr);
        
        
        while(!st.empty()){
            
            list.add(curr.val);
            
            if(curr.right != null) st.push(curr.right);
            if(curr.left != null) st.push(curr.left);
            curr = st.pop();
        }
        
        return list;
    }
}