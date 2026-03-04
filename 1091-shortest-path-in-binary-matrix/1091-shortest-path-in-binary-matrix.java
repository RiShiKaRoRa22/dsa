class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int path=0;

        Queue<Integer> qi= new LinkedList<>();
        Queue<Integer> qj= new LinkedList<>();
        int n=grid.length;
        if(grid[0][0]==0){
            qi.offer(0);
            qj.offer(0);
            grid[0][0]=1;
        }
        else{
            return -1;
        }
        //int path=0;

        while(!qi.isEmpty()){
            int k=qi.size();
            path++;

            for(int ind=0;ind<k;ind++){
                int i=qi.poll();
                int j=qj.poll();

                if(i==n-1 && j==n-1){
                    return path;
                }
                //down
                if(i+1<n && grid[i+1][j]==0){
                    qi.offer(i+1);
                    qj.offer(j);
                    grid[i+1][j]=1;
                }
                //right
                if(j+1<n && grid[i][j+1]==0){
                    qi.offer(i);
                    qj.offer(j+1);
                    grid[i][j+1]=1;
                }
                //up
                if(i-1>=0 && grid[i-1][j]==0){
                    qi.offer(i-1);
                    qj.offer(j);
                    grid[i-1][j]=1;
                }
                //left
                if(j-1>=0 && grid[i][j-1]==0){
                    qi.offer(i);
                    qj.offer(j-1);
                    grid[i][j-1]=1;
                }
                //left upar
                if(i-1>=0 && j-1>=0 && grid[i-1][j-1]==0){
                    qi.offer(i-1);
                    qj.offer(j-1);
                    grid[i-1][j-1]=1;
                }
                //right upar
                if(j+1<n && i-1>=0 && grid[i-1][j+1]==0){
                    qi.offer(i-1);
                    qj.offer(j+1);
                    grid[i-1][j+1]=1;
                }
                //left neeche    
                if(i+1<n && j-1>=0 && grid[i+1][j-1]==0){
                    qi.offer(i+1);
                    qj.offer(j-1);
                    grid[i+1][j-1]=1;
                }
                //right neeche
                if(j+1<n && i+1<n && grid[i+1][j+1]==0){
                    qi.offer(i+1);
                    qj.offer(j+1);
                    grid[i][j+1]=1;
                }




            }
        }
        return -1;
        

        
        
    }
}