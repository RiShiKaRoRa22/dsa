class Solution {
    
    public boolean isBipartite(int[][] graph) {
        //dfs
        int visited[]= new int[graph.length];
        for(int g=0;g<graph.length;g++){
            if(visited[g]==0){
            
                if(!dfs(graph,1,visited, g)){
                    return false;
                }
            }
            }
        
        return true;

        
    }

    public boolean dfs(int[][] graph,int colour, int[] visited, int i){

        visited[i]=colour;
        for(int ind: graph[i]){
            if(visited[ind]==0){
                if(!dfs(graph,-colour, visited, ind)){
                    return false;
                }
            }
            else if(visited[ind]==colour){
                return false;
            }
        }

        return true;


    }
}