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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root==null){
            return res;
        }
        int i=0;
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int j=q.size();
            List<Integer> temp= new ArrayList<>();
            for(int k=0;k<j;k++){
                    TreeNode rv= q.poll();
                    temp.add(rv.val); 
                    if(rv.left!=null){
                        q.offer(rv.left);
                    }
                    if(rv.right!=null){
                        q.offer(rv.right);
                    }
                }
            if(i%2==0){
                res.add(temp);   
            }
            else{
                Collections.reverse(temp);
                res.add(temp);

            }
            i++;  
        }
        return res;
        
    }
}