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
    List<List<Integer>> result= new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<Integer> list= new ArrayList<>();
        if(root==null){
            return result;
        }
        pathsum(list,targetSum,root);
        return result;
        
    }
    public void pathsum(List<Integer> list, int target, TreeNode root){
        if(root==null){
            return ;
        }
        int c= target-root.val;
        list.add(root.val);

        if(root.right==null && root.left==null && c==0){
            result.add(new ArrayList<>(list));
          
        }
        else if(root.right==null && root.left==null){
            list.remove(list.size()-1);
            return;
        }
       
        else{
             pathsum(list,c,root.left);
        pathsum(list,c,root.right);

        }
       
        list.remove(list.size()-1);
        
    }
        
    
}