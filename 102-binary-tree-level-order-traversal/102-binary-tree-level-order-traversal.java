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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        // this is the final 2-D Matrix to be returned
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        
        // Handling Edge Case
        if(root == null){
            return ans;
        }
        
        // 
        Queue<TreeNode> queue = new LinkedList<>();
        
        
            
        queue.add(root);
        
        // traversing whole tree level by level
        
        while(!queue.isEmpty()){
            // list that contains each level
            List<Integer> list = new ArrayList<>();
            
            int size = queue.size();
            
            // adding all value of a particular level in the list
            // adding all child nodes and preparing for next level
            
            for(int i = 0; i < size; i++){
                
                
                // node that is to be added in list 
                // before that we are storing its child
                TreeNode temp = queue.poll();   
                
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
                
                list.add(temp.val);
            }
            
            ans.add(list);
        }
        
        return ans;
    }
}