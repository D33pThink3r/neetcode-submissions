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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> Q=new LinkedList<>();
        if(root==null) return 0;
        Q.add(root);
        int counter=0;
        while(!Q.isEmpty()){
            int size=Q.size();
            for(int i=0;i<size;i++){
                TreeNode x=Q.poll();
                if(x.left!=null)Q.add(x.left);
                if(x.right!=null)Q.add(x.right);
            }
            counter++;
        }
        return counter;
    }
}
