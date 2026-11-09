class Solution {
    public int countServers(int[][] grid) {
        //if one server- check for the communicating server
        int m=grid.length;
        int n=grid[0].length;
        int cols[]=new int[n];
        int rows[]= new int[m];
        int count=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
            rows[i]=count;
            count=0;
        }

        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                if(grid[i][j]==1){
                    count++;
                }
            }
            cols[j]=count;
            count=0;
        }
        int num=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                   if(rows[i]>1 || cols[j]>1){
                    num++;
                   }
                }
            }
        }
        return num;
            
    

    }
}