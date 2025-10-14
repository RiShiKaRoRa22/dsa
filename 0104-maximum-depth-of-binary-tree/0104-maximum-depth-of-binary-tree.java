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
        if(root==null){
            return 0;
        }
        /*Stack<TreeNode> stack= new Stack<>();
        Stack<Integer> depth= new Stack<>();

        stack.push(root);
        depth.push(1);

        int count=1;

        TreeNode temp=root;
        int maxdepth=0;
        while(!stack.isEmpty()){
            temp=stack.pop();
            int maxx=depth.pop();
            maxdepth= Math.max(maxdepth, maxx);
            if(temp.right!=null){
                stack.push(temp.right);
                depth.push(maxx+1);
            }
            if(temp.left!=null){
                stack.push(temp.left);
                depth.push(maxx+1);
            }
        }  
        return maxdepth;*/  


        return Math.max(1+maxDepth(root.left), 1+maxDepth(root.right));
    }
}