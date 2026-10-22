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
    int counter=0;
    int result;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return result;
    }
    public void dfs(TreeNode cur,int k){
        if(cur==null) return;
        dfs(cur.left,k);
        if(counter==k) return;
        counter++;
        if(counter==k){
            result=cur.val;
            return;
        }
        dfs(cur.right,k);
    }
}
