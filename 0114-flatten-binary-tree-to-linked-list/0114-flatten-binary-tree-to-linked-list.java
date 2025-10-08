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
    public void flatten(TreeNode root) {
        if(root==null || (root.right==null && root.left==null)){
            return;
        }
     
        List<TreeNode> list= new ArrayList<>();
        preorder(root,list);
        for(TreeNode t: list){
            root.right=t;
            root.left=null;
            root=root.right;
        }

        
    }

    public void preorder(TreeNode root, List<TreeNode> result){
        if(root==null){
            return;
        }
        result.add(root);
        preorder(root.left,result);
        preorder(root.right,result);

    }
}