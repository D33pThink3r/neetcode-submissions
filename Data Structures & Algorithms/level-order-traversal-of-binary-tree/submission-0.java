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
        List<List<Integer>> sol=new ArrayList<>();
        if(root==null) return sol;        
        Queue<TreeNode> Q=new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int size=Q.size();
            for(int i=0;i<size;i++){
                TreeNode n=Q.poll();
                level.add(n.val);
                if(n.left!=null)Q.add(n.left);
                if(n.right!=null) Q.add(n.right);      
            }
            sol.add(level);
        }
        return sol;
    }
}
