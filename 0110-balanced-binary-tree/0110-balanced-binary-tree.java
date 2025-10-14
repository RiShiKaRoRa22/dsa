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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        /*isBalanced(root.left);
        isBalanced(root.right);*/
        return(Math.abs(maxdepth(root.left)-maxdepth(root.right)) <=1) && isBalanced(root.left) && isBalanced(root.right);    
        
    }

    public int maxdepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(1+maxdepth(root.left), 1+maxdepth(root.right));
    }
}