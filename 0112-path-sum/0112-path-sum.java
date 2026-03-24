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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        return pathsum(targetSum,root);
        
    }
    public boolean pathsum(int target, TreeNode root){
        if(root==null){
            return false;
        }
        int c= target-root.val;

        if(root.right==null && root.left==null && c==0){
            return true;
        }
        else if(root.right==null && root.left==null){
            return false;
        }
        return pathsum(c,root.left) || pathsum(c,root.right);
        
    }
}