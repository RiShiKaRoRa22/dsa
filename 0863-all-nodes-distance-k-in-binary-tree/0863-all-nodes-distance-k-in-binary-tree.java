/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode,List<TreeNode>> graph= new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        //do graph from tree

        //Map<TreeNode,List<TreeNode>> graph= new HashMap<>();
        build(root);

        //map.put(root,new ArrayList<>(){root.left,root.right});
        
        //now do bfs
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(target);
        Set<TreeNode> visited = new HashSet<>();
        visited.add(target);
        List<Integer> list= new ArrayList<>();
        int dist=0;
        while(!q.isEmpty()){
            if(dist==k){
                
                for(TreeNode t:q){
                    list.add(t.val);
                }
                return list;

            }
            else{
                int kk=q.size();
                for(int i=0;i<kk;i++){
                    TreeNode popped= q.poll();
                    for(TreeNode t: graph.get(popped)){
                        if(!visited.contains(t)){
                            q.offer(t);
                            visited.add(t);
                        }
                        
                    }
                    
                }
                dist++;

            }
            
        }
        return list;
          
    }

    public void build(TreeNode root){
            if(root==null){
                return ;
            }
            graph.putIfAbsent(root,new ArrayList<>());
            if(root.right!=null){
                graph.putIfAbsent(root.right,new ArrayList<>());
                graph.get(root).add(root.right);
                graph.get(root.right).add(root);
            }
            if(root.left!=null){
                graph.putIfAbsent(root.left,new ArrayList<>());
                graph.get(root).add(root.left);
                graph.get(root.left).add(root);
                
            }
            build(root.left);
            build(root.right);
        }
    

    
}