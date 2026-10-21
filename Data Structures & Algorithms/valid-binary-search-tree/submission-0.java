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
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        return validate(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public boolean validate(TreeNode cur,int min, int max){
        if(cur==null) return true;
        if(cur.val<=min || cur.val>=max) return false;
        return validate(cur.left,min,cur.val) &&            validate(cur.right,cur.val,max);
    }
}
