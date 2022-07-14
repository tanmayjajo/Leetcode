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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> st = new Stack<>();
        
        TreeNode curr = root;
        
        while(true){
            if(curr != null){
                st.push(curr);
                curr = curr.left;
            }else{
                if(st.empty()) break;
                curr = st.pop();
                list.add(curr.val);
                curr = curr.right;
            }
        }
        
        return list;
    }
}