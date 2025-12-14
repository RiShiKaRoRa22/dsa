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
    public int diam;
    public int diameterOfBinaryTree(TreeNode root) {
        //height of left + height or right tree,NO doesnt always pass from root
        heightmax(root);
        return diam;

        

        
    }
    public int heightmax(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftheight=heightmax(root.left);
        int rightheight=heightmax(root.right);
        diam=Math.max(diam,leftheight+rightheight);
        return  Math.max(leftheight+1 ,rightheight+1);
    }
}