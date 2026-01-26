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
    //EXCAHNEG VALUES NOT TREENODES!!!!
    List<Integer> list= new ArrayList<>();
    TreeNode prev=null;
    TreeNode first=null;
    TreeNode next=null;
    public void recoverTree(TreeNode root) {
        inorder(root);
        if(first!=null && next!=null){
            int temp=first.val;
            first.val=next.val;
            next.val=temp;

        }
       
        

    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        if(prev!=null  && prev.val>root.val){
            if(first==null){
                first=prev;
            }
            
            next=root;
               
        }
        prev=root;
        inorder(root.right);
    }
    
}