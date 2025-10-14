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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode bst= new TreeNode(preorder[0]);
        for(int x: preorder){
            TreeNode t= new TreeNode(x);
            bst=addbst(bst,t);
        }
        return bst;

        
    }
    public TreeNode addbst(TreeNode root,TreeNode tnode){
        if(root==null){
            return tnode;

        }

        if(tnode.val>root.val){
            root.right=addbst(root.right,tnode);
        }

        else if(tnode.val<root.val){
            root.left=addbst(root.left,tnode);
        }
        return root;
    }
}