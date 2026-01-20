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
    Map<Integer,Integer> inMap= new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        TreeNode root=build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        return root;


            
        
    }

    public TreeNode build(int[] preorder,int pstart, int pEnd ,int[] inorder,int instart, int inEnd){
        if(pstart>=preorder.length || instart>=inorder.length ){
            return null;
        }
        if(pstart>pEnd || instart> inEnd){
            return null;
        }
        TreeNode root= new TreeNode();
        
        root.val= preorder[pstart];
        int rootval= inMap.get(root.val);
        int leftnum= rootval-instart;

        root.left=build(preorder,pstart+1,leftnum+pstart,inorder,instart, rootval-1);
        root.right= build(preorder,leftnum+pstart+1,pEnd,inorder,rootval+1,inEnd);
        return root;
    }
}