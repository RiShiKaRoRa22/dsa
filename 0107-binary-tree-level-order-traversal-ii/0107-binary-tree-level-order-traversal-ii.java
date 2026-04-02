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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        List<List<Integer>> result= new ArrayList<>();
        if(root!=null){
            q.offer(root);

        }
        else{
            return result;
        }
        
        while(!q.isEmpty()){
            int k=q.size();
            List<Integer> list= new ArrayList<>();
            for(int i=0;i<k;i++){
                TreeNode temp= q.poll();
                list.add(temp.val);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                 if(temp.right!=null){
                    q.offer(temp.right);
                }

            }
            result.add(list);    
        }

        Collections.reverse(result);
        return result;
        
    }
}