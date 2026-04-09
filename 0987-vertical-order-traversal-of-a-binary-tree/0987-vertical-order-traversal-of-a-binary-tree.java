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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if(root==null){
            return null;
        }
        List<List<Integer>> res= new ArrayList<>();

        Queue<int[]> pos= new LinkedList<>();
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        pos.add(new int[]{0,0});
        Map<Integer, PriorityQueue<int[]>> map= new HashMap<>();

        //cols+1 cols -1

        while(!q.isEmpty()){
            int size= q.size();
            
            for(int i=0;i<size;i++){
                TreeNode temp= q.poll();
                int[] poss=pos.poll();
                int row=poss[0];
                int col=poss[1];
                map.putIfAbsent(col, new PriorityQueue<>((a,b)->{
                    if(a[0]==b[0])return a[1]-b[1];
                    return a[0]-b[0];
                }));
                map.get(col).add(new int[]{row,temp.val});

                if(temp.left!=null){
                    q.add(temp.left);
                    pos.add(new int[]{row+1,col-1});
                }
                if(temp.right!=null){
                    q.add(temp.right);
                    pos.add(new int[]{row+1,col+1});
                }
            }

        }
        //res.addAll(map.values());


        List<Integer> indices= new ArrayList<>();
        indices.addAll(map.keySet());
        Collections.sort(indices);
        for(int i: indices){
            PriorityQueue<int[]> temp= new PriorityQueue<>();
            temp= map.get(i);
            List<Integer> li= new ArrayList<>();

            while(!temp.isEmpty()){
                li.add(temp.poll()[1]);
            }
            res.add(li);
        }

        return res;
        
        
        
               //same column ones get printed in same array
        
        
    }
}