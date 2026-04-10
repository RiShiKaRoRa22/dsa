/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb= new StringBuilder();
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode t= q.poll();
                if(t==null){
                    sb.append("n").append(",");
                    continue;
                }
                sb.append(t.val).append(",");
                q.offer(t.left);
                q.offer(t.right);
            }
           
        }
        return sb.toString();


        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<TreeNode> q= new LinkedList<>();
        List<String> list= new ArrayList<>();
        StringTokenizer st= new StringTokenizer(data,",");
        while(st.hasMoreTokens()){
            list.add(st.nextToken());
        }
        int ind=0;
        TreeNode root;
        if(!list.get(ind).equals("n")){
            root= new TreeNode(Integer.parseInt(list.get(ind++)));
            q.offer(root);
        }
        else{
            return null;
        }
        
        while(!q.isEmpty()){
            int s= q.size();
            for(int i=0;i<s;i++){
                TreeNode curr=q.poll();

                String a=list.get(ind);
                if(!a.equals("n")){
                    TreeNode rl= new TreeNode(Integer.parseInt(a));
                    curr.left=rl;
                    q.offer(rl);
                }
                ind++;

                String b= list.get(ind);
                if(!b.equals("n")){
                    TreeNode rr= new TreeNode(Integer.parseInt(b));
                    curr.right=rr;
                    q.offer(rr);
                }
                ind++;
            }
        } 
        return root;       
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));